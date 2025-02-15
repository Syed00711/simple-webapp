package com.microcare.academy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TestCOnnection {

	public static void main(String[] args) throws SQLException {
		DatabaseConnection db=new DatabaseConnection();
		Connection conn=db.getConnection();
		String query="select * from books where bookid>?";
		PreparedStatement ps=conn.prepareStatement(query);
		ps.setInt(1, 10);

		
		ResultSet rs= ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt("bookid") +"====="+rs.getString("title"));

		}
	}

	
}
