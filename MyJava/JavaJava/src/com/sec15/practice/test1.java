package com.sec15.practice;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import static common.JDBCTemplate.*;

public class test1 {
	public static void main(String[] args) {
		// GetEmp_Res
		Connection conn = getConnection();
		CallableStatement cstmt = null;
		ResultSet rs = null;
		try {
			String sql = "{ call GetEmp_Res() }";
			cstmt = conn.prepareCall(sql);
			
			cstmt.execute();
			rs = cstmt.getResultSet();
			System.out.println("EMPNO\tENAME\tMGR\tLEVEL");
            System.out.println("==================================");
            
            while(rs.next()) {
            	int empno = rs.getInt("EMPNO");
            	String ename = rs.getString("ENAME");
                int mgr = rs.getInt("MGR");
                int level = rs.getInt("LEVEL");

                System.out.printf("%d\t%s\t%s\t%d\n", empno, ename, mgr, level);
            }
			commit(conn);
		}catch(SQLException e) {
			rollback(conn);
			e.printStackTrace();
		} finally {
			Close(rs);
			Close(cstmt);
			Close(conn);
		}
	}
}
