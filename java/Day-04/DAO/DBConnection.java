package com.sonata.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	Connection connection;
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/emplyoee_details","root","root@123");
			
		}catch(ClassNotFoundException e) {System.out.println(e);}
		catch(SQLException e1) {e1.printStackTrace();}
		return connection;
	}
	public void closeConnection() {
		try {
			if(connection !=null)
				connection.close();
		}catch(SQLException e) {e.printStackTrace();}
	}

}
