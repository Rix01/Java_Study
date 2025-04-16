package work.com.workshop14.test04.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import work.com.workshop14.test04.model.Product;

import static common.JDBCTemplate.*;

public class ProductDAOImple implements ProductDAO{

	@Override
	public List<Product> selectDiscard(Date d) {
		List<Product> list = new ArrayList<>();
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Product product = null;
		
		try {
			pstmt = conn.prepareStatement(SELECT_SQL);
			pstmt.setDate(1, d);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				product = new Product(rs.getInt("pdno"),
						  rs.getString("pdname"),
						  rs.getString("pdsubname"),
						  rs.getInt("factno"),
						  rs.getDate("pddate"),
						  rs.getInt("pdcost"),
						  rs.getInt("pdprice"),
						  rs.getInt("pdamount"));
				
				list.add(product);
			}
			commit(conn);
			
		}catch(SQLException e) {
			rollback(conn);
			e.printStackTrace();
		}finally {
			Close(rs);
			Close(pstmt);
			Close(conn);
		}
		return list != null ? list:new ArrayList<>();
	}

	@Override
	public int insertDiscard(List<Product> list) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int res = 0;
		int cnt = 0;
		try {
			pstmt = conn.prepareStatement(INSERT_SQL);
			for(Product p:list) {
				Date today = new Date(System.currentTimeMillis());
				pstmt.setInt(1, p.pdno());
				pstmt.setString(2, p.pdname());
				pstmt.setString(3, p.pdsubname());
				pstmt.setInt(4, p.factno());
				pstmt.setDate(5, p.pddate());
				pstmt.setInt(6, p.pdcost());
				pstmt.setInt(7, p.pdprice());
				pstmt.setInt(8, p.pdamount());
				pstmt.setDate(9, today);
				
				cnt +=1;
				res = pstmt.executeUpdate();
			}
			commit(conn);
		}catch(SQLException e) {
			rollback(conn);
			e.printStackTrace();
		}finally{
			Close(pstmt);
			Close(conn);
		}
		
		return cnt;
	}

	@Override
	public int deleteDiscard(List<Product> list) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int res = 0;
		int cnt = 0;
		try {
			pstmt = conn.prepareStatement(DELETE_SQL);
			for(Product p:list) {
				Date today = new Date(System.currentTimeMillis());
				pstmt.setInt(1, p.pdno());
				
				cnt +=1;
				res = pstmt.executeUpdate();
			}
			commit(conn);
		}catch(SQLException e) {
			rollback(conn);
			e.printStackTrace();
		}finally{
			Close(pstmt);
			Close(conn);
		}
		return cnt;
	}

}
