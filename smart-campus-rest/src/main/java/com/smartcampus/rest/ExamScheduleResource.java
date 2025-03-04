package com.smartcampus.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/exams")
public class ExamScheduleResource {

    // GET endpoint to retrieve exam schedules
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getExamSchedules() {
        // In production, fetch exam schedules from the database.
        String examsJson = "[{\"courseId\":1, \"examDate\":\"2025-05-01\"}, {\"courseId\":2, \"examDate\":\"2025-06-15\"}]";
        return Response.ok(examsJson).build();
    }
}

