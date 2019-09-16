package com.dn.rest.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Muthukumar Thangavinayagam.
 *
 */

@Path("/helloworld")
public class DnHelloWorldService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getDnHelloWorldService() {
		return "DevNotes Hello World! RS Demo..";
	}
	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "DevNotes Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
}
