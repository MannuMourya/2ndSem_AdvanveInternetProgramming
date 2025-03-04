package com.smartcampus.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PostServlet", urlPatterns = {"/postServlet"})
public class PostServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Process form submission via POST method
        String firstName = request.getParameter("firstName");
        String lastName  = request.getParameter("lastName");
        String email     = request.getParameter("email");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>POST Request Processed</h2>");
        out.println("<p>Received Data:</p>");
        out.println("<ul>");
        out.println("<li>First Name: " + firstName + "</li>");
        out.println("<li>Last Name: " + lastName + "</li>");
        out.println("<li>Email: " + email + "</li>");
        out.println("</ul>");
        out.println("</body></html>");
    }
}

