package com.sudhy.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("books")
public class BooksRESTServlet {
	
	 @Path("/getbooks.json")
	 @GET
	 @Consumes(MediaType.APPLICATION_JSON)
	 @Produces(MediaType.APPLICATION_JSON)
	 public Response getBooksList(@Context HttpHeaders headers, String postData) {
	     
		 return Response.ok("{'halwa' : 'jaffa'}").build();
	     
	 }
}
