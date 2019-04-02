package com.niit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Databasecon {
	public  static Connection  getDatBaseConnection()
	{
		
		String url="jdbc:sqlserver://172.23.237.11; databaseName=employeeproject;user=sa;password=P@ssw0rd";
			
		Connection con=null;
		try {
			con = DriverManager.getConnection(url);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return con;
	}

}
