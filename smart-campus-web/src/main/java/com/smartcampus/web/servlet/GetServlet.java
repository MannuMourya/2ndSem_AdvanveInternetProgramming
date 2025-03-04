package com.smartcampus.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "GetServlet", urlPatterns = {"/getServlet"})
public class GetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Demonstrate session management
        HttpSession session = request.getSession(true); // Create session if it doesn't exist
        Date creationTime = new Date(session.getCreationTime());
        Date lastAccessedTime = new Date(session.getLastAccessedTime());

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>GET Request Processed</h2>");
        out.println("<p>Session Created: " + creationTime + "</p>");
        out.println("<p>Last Accessed: " + lastAccessedTime + "</p>");
        out.println("</body></html>");
    }
}

