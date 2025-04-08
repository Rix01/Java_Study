package com.sec15.practice;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import static common.JDBCTemplate.*;

public class test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("피보나치 구하기 : ");
		int p_limit = sc.nextInt();
		
		Connection conn = getConnection();
		CallableStatement cstmt = null;
		ResultSet rs = null;
		
		try {
			String sql = "{ call 04_Fibonacci_CTE(?) }";
			cstmt = conn.prepareCall(sql);
			cstmt.setInt(1, p_limit);
			
			cstmt.execute();
			rs = cstmt.getResultSet();
			
			while(rs.next()) {
				int n = rs.getInt("항번호");
				int fib = rs.getInt("피보나치 수열");
				System.out.printf("%d\t%d\n", n, fib);
			}
			
			commit(conn);
		}catch(SQLException e){
			rollback(conn);
			e.getStackTrace();
		}finally {
			Close(rs);
			Close(cstmt);
			Close(conn);
		}
	}
}
