package com.microcare.academy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDB {
	
	public Book getBookData(int bookid) throws SQLException {
		DatabaseConnection db=new DatabaseConnection();
		Connection conn=db.getConnection();
		String query="select * from books where bookid=?";
		PreparedStatement ps=conn.prepareStatement(query);
		ps.setInt(1, bookid);

		
		ResultSet rs= ps.executeQuery();
		Book book=new Book();
		while(rs.next()) {

			book.setBookId(rs.getInt("bookid"));
			book.setTitle(rs.getString("Title"));
           book.setAuthor(rs.getString("author"));
		}
		
		return book;
	}
	
	public boolean updateBookData(int bookid,String title) throws SQLException {
		DatabaseConnection db=new DatabaseConnection();
		Connection conn=db.getConnection();
		String query="update books set title=? where bookid=?";
		PreparedStatement ps=conn.prepareStatement(query);
		ps.setString(1, title);
		ps.setInt(2, bookid);

		
		ResultSet rs= ps.executeQuery();
	
		
		return true;
	}

}
