package work.com.workshop14.test02.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import work.com.workshop14.test02.model.Product;

import static common.JDBCTemplate.*;

public class ProductDAOImple implements ProductDAO{

	@Override
	public List<Product> findProduct() {
		List<Product> list = new ArrayList<>();
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		Product product = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECT_SQL);
			
			while(rs.next()) {
				product = new Product(
						rs.getString("pdsubname"),
						rs.getInt("pdcost"),
						rs.getInt("pdprice"));
				
				list.add(product);
			}
			
			commit(conn);
		}catch(SQLException e) {
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
