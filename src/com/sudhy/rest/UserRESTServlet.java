package com.sudhy.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("users")
public class UserRESTServlet {

	//Get Users List - Existing - GET with No UserID
	@Path("/getusers.json")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUsersList(@Context HttpHeaders headers, String postData) {
	     
		 return Response.ok("{'halwa' : 'jaffa'}").build();
	     
	 }
	
	
	//Get User info - Existing - GET with UserID
	@Path("/getuser/{userId}.json")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUsersInfo(@PathParam("userId") String userId, @Context HttpHeaders headers, String postData) {
	     
		//Got the User ID in userId object retrieve the info
		
		 return Response.ok("{'halwa' : " + userId + "}").build();
	     
	}
	
	
	
	//Insert User - New - POST with User Data
	
	@Path("/adduser.json")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addUser(@Context HttpHeaders headers, String postData) {
	     
		//Got the User Data as postData object store the info
		
		 return Response.ok("{'halwa' : 'jaffa'}").build();
	     
	}

	
	
	//Update User - Existing - PUT with User Data
	
	@Path("/updateuser/{userId}.json")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateUser(@PathParam("userId") String userId, @Context HttpHeaders headers, String postData) {
	     
		//Got the User Data as postData object update the info
		
		 return Response.ok("{'halwa' : 'jaffa'}").build();
	     
	}
	
	
	//Delete User - Existing - Delete with UserID
	@Path("/deleteuser/{userId}.json")
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteUser(@PathParam("userId") String userId, @Context HttpHeaders headers, String postData) {
	     
		//Got the User Data as userId object and delete the info
		
		 return Response.ok("{'halwa' : 'jaffa'}").build();
	 
		 
	}

	
	@Path("/authenticate")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response authenticateUser(@Context HttpHeaders headers, String postData) {
		
		//Get the data from postData -  Authenticate - Create SM_SESSION header Store in Session Object for further Verification
		
		 return Response.ok("{'halwa' : 'jaffa'}").build();
	}
	
}
