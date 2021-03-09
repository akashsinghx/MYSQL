package com.ltts.configuration;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
	
	public static Connection getConnection() throws Exception
	{
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		return c;
		
	}
	

}