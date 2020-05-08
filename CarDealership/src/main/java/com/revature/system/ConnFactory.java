package com.revature.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnFactory {
	private static ConnFactory cf = new ConnFactory();
	
	private ConnFactory() {
		super();
	}
	public static synchronized ConnFactory getInstance() {
		if(cf == null)
			cf = new ConnFactory();
		return cf;
	}
	public Connection getConnection() {
		//java2004usf.c3ze8kvqgwxn.us-east-2.rds.amazonaws.com
		String url = "";
		String user = "Username";
		String password = "Password";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
