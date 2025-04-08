package com.sec15.practice;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import static common.JDBCTemplate.*;

public class test2 {
	public static void main(String[] args) {
		Connection conn = getConnection();
		CallableStatement cstmt = null;
		ResultSet rs = null;
		
		try {
			String sql = "{ call 02_GuGuDan() }";
			cstmt = conn.prepareCall(sql);
			
			cstmt.execute();
			rs = cstmt.getResultSet();
			
			while(rs.next()) {
				String gugudan = rs.getString("GuGuDan_PRN");
				
				System.out.println(gugudan);
			}
			commit(conn);
		} catch (SQLException e) {
			rollback(conn);
			e.getStackTrace();
		} finally {
			Close(rs);
			Close(cstmt);
			Close(conn);
		}
	}
}
