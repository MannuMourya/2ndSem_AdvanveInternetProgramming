package com.smartcampus.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/courses")
public class CourseResource {

    // GET endpoint to retrieve course information
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCourses() {
        // In production, fetch courses from the database.
        String coursesJson = "[{\"id\":1, \"courseName\":\"Computer Science\"}, {\"id\":2, \"courseName\":\"Mathematics\"}]";
        return Response.ok(coursesJson).build();
    }
}

