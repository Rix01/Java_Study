package work.com.workshop14.test01.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import work.com.workshop14.test01.model.ProFacStoDTO;

import static common.JDBCTemplate.*;

public class ProFacStoDAOImple implements ProFacStoDAO{

	@Override
	public List<ProFacStoDTO> find() {
		List<ProFacStoDTO> list = new ArrayList<>();
		ProFacStoDTO pfs = null;
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECT_SQL);
			
			while(rs.next()) {
				// PDNAME, PDSUBNAME, FACNAME, STONAME, STAMOUNT
				pfs = new ProFacStoDTO(
						rs.getString("pdname"),
						rs.getString("pdsubname"),
						rs.getString("facname"),
						rs.getString("stoname"),
						rs.getInt("stamount"));
				list.add(pfs);
			}
			commit(conn);
		} catch(SQLException e){
			rollback(conn);
			e.printStackTrace();
		} finally {
			Close(rs);
			Close(stmt);
			Close(conn);
		}
		
		return list;
	}

}
