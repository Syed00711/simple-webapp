package com.microcare.academy;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.json.JSONObject;

@Path("/")
public class ExampleRestAPI {
	
	@Path("/simple/{name}/{location}")
	@GET
	public Response getData(@PathParam("name") String name,@PathParam("location") String location) {
		return Response.status(Status.BAD_REQUEST).entity("Path variable is "+name +"  and location is "+location).build();
	}
	
	@Path("/rp")
	@GET
	public Response getRequestParam(@QueryParam("name") String name,@QueryParam("id") String id) {
		return Response.ok().entity("The given id :"+id+" and name is"+name).build();
	}
	
	@Path("/rb")
	@GET
	public Response getRequestBody(String data){
		JSONObject jo=new JSONObject(data);
		return Response.ok().entity("GET METHOD").build();
	}
	
	@Path("/rb")
	@POST
	public Response getRequestBodyPost(String data){
		JSONObject jo=new JSONObject(data);
		return Response.ok().entity("POST METHOD").build();
	}
	@Path("/rb")
	@PUT
	public Response getRequestBodyPut(String data){
		JSONObject jo=new JSONObject(data);
		return Response.ok().entity("PUT METHOD").build();
	}
	
	@Path("/rb")
	@DELETE
	public Response getRequestBodyDelete(String data){
		JSONObject jo=new JSONObject(data);
		return Response.ok().entity("DELETE METHOD").build();
	}

}
