package work.com.workshop14.factory.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import work.com.workshop14.factory.model.Factory;

import static common.JDBCTemplate.*;

public class FactoryDAOImple implements FactoryDAO{

	@Override
	public List<Factory> getFactoryAll() {
		List<Factory> list = new ArrayList<>();
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		Factory factory;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECT_SQL);
			// FACTNO, FACNAME, FACLOC
			while(rs.next()) {
				factory = new Factory(rs.getString("factno"), rs.getString("facname"), rs.getString("facloc"));
				list.add(factory);
			}
			
			rollback(conn);
		}catch(SQLException e) {
			rollback(conn);
			e.printStackTrace();
		}finally{
			Close(rs);
			Close(stmt);
			Close(conn);
		}
		return list;
		
	}

}
