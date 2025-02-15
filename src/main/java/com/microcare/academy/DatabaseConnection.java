package com.microcare.academy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class DatabaseConnection {
	public Connection getConnection() {
		 String url
        = "jdbc:oracle:thin:@microcaredb3_high?TNS_ADMIN=/Users/sh030348/Desktop/microcare/Wallet_microcaredb3"; 
    String username = "ADMIN"; 
    String password = "Microcaredb3";
    Connection connection=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			DriverManager.registerDriver(new OracleDriver());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			connection= DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
    
	}
}
