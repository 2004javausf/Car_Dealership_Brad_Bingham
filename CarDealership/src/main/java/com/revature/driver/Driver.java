package com.revature.driver;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.system.ConnFactory;

public class Driver {
	public static void main(String[] args) {
//		Lot lot = Lot.getLotData();
//		System.out.println(lot.getLotData());
		
		ConnFactory cf = ConnFactory.getInstance();
		Connection conn = cf.getConnection();
		String sql = "select CONTRACT_ID from CONTRACT_TBL where CONTRACT_ID = 1";
		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			System.out.println("This is printing out "+rs.getInt(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
}
