package com.microcare.academy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/microcare")
public class MicrocareExample {
	
	@Path("/test")
	@GET
	public String getMicrocare() {
		return "This is GET mehtod for microcare";
	}

}
