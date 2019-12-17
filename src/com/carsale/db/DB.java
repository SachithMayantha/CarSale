package com.carsale.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

	static String url = "jdbc:mysql://localhost:3306/db_carsale";
	static String driver = "com.mysql.jdbc.Driver";
	
	static Connection con = null;
	
	public static Connection getCon() throws Exception {
		if(con==null) {
			Class.forName(driver);
			//my username and password
			con = DriverManager.getConnection(url, "root","");
		}
		return con;
	}
	
}
