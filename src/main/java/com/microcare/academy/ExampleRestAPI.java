package com.microcare.academy;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.json.JSONObject;

@Path("/")
public class ExampleRestAPI {
	

	
	@Path("/book")
	@GET
	public Response getBook(@QueryParam("id") int id) throws SQLException {
		BookDB bookDB=new BookDB();
		Book book= bookDB.getBookData(id);
		
		return Response.ok().entity(book.toString()).build();
	
	}
	
	@Path("/book")
	@PUT
	public Response updateBook(@QueryParam("id") int id,@QueryParam("title") String title) throws SQLException {
		BookDB bookDB=new BookDB();
 bookDB.updateBookData(id,title);
		
		return Response.ok().entity("book updated.").build();
	
	}
	
	@Path("/book")
	@POST
	public Response createBook(String book) throws SQLException {
		BookDB bookDB=new BookDB();
		JSONObject jo=new JSONObject(book);
		
		Book book1=new Book();
		book1.setBookId(Integer.parseInt(jo.getString("bookid")));
		book1.setTitle(jo.getString("title"));
		book1.setAuthor(jo.getString("auther"));
		book1.setPrice(Double.parseDouble(jo.getString("price")));
		book1.setPublishedDate(Integer.parseInt(jo.getString("publishedyear")));
 bookDB.createBookData(book1);
		
		return Response.ok().entity("book created.").build();
	
	}
	
	@Path("/book")
	@DELETE
	public Response deleteBook(@QueryParam("id") int id) throws SQLException {
		BookDB bookDB=new BookDB();
		 bookDB.deleteBookData(id);
		
		return Response.ok().entity("Book deleted").build();
	
	}
	
	
	

}
