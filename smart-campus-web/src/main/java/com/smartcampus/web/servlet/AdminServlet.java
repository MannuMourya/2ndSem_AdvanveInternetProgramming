package com.smartcampus.web.servlet;

import com.smartcampus.ejb.RegistrationBean;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AdminServlet", urlPatterns = {"/admin"})
public class AdminServlet extends HttpServlet {

    @EJB
    private RegistrationBean registrationBean; // Example EJB injection

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Simple admin login process
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        HttpSession session = request.getSession(true);

        // For demonstration, use hard-coded credentials ("admin"/"admin")
        if ("admin".equals(username) && "admin".equals(password)) {
            session.setAttribute("isAdmin", true);
            response.sendRedirect("adminPanel.jsp");
        } else {
            response.sendRedirect("login.jsp?error=Invalid credentials");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Example stub for a CRUD operation (e.g., searching for a user)
        String searchUsername = request.getParameter("searchUsername");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Admin User Search</h2>");
        out.println("<p>Search for user: " + searchUsername + "</p>");
        // In a full implementation, use JPA EntityManager to search in the database.
        out.println("</body></html>");
    }
}

