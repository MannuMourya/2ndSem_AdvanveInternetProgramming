package com.smartcampus.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
public class UserResource {

    // GET endpoint to retrieve user data
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsers() {
        // In production, fetch users from the database.
        String usersJson = "[{\"id\":1, \"username\":\"john.doe\"}, {\"id\":2, \"username\":\"jane.smith\"}]";
        return Response.ok(usersJson).build();
    }

    // POST endpoint to create a new user
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createUser(String userJson) {
        // In production, process the JSON to create a user.
        return Response.status(Response.Status.CREATED).entity(userJson).build();
    }
}

