package work.com.workshop14.test01;

import java.sql.Connection;

import work.com.workshop14.test01.controller.Controller;

import static common.JDBCTemplate.*;

// view -> controller -> model[biz, dao] -> JDBCTemplate -> DB
public class Test01 {
	public static void main(String[] args) {
		new Controller().run();
		
	}
	
	
}
