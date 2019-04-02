package com.niit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStatement {
	public static void main(String args[]) {

		String query = "insert into dept values (44,'IT')";
		Connection con = Databasecon.getDatBaseConnection();

		Statement st;
		try {
			st = con.createStatement();
			int rows = st.executeUpdate(query);
			System.out.println(rows + "rows updated");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
			System.out.println(e.getNextException());
		}

		
		
	}
}
