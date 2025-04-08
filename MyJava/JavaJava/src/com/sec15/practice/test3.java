package com.sec15.practice;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import static common.JDBCTemplate.*;

public class test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 단의 숫자를 입력하세요 : ");
		int dan = sc.nextInt();
		
		Connection conn = getConnection();
		CallableStatement cstmt = null;
		ResultSet rs = null;
		
		try {
			String sql = "{ call 03_GuGuDan(?) }";
			cstmt = conn.prepareCall(sql);
			cstmt.setInt(1, dan);
			
			cstmt.execute();
			rs = cstmt.getResultSet();
			
			while(rs.next()) {
				String gugudan = rs.getString("GuGuDan_PRN");
				
				System.out.println(gugudan);
			}
			
			commit(conn);
			
		} catch(SQLException e) {
			rollback(conn);
			e.getStackTrace();
		} finally {
			Close(rs);
			Close(cstmt);
			Close(conn);
		}
	}
}
