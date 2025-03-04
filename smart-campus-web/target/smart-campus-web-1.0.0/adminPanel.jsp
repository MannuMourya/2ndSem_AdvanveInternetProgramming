<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Boolean isAdmin = (Boolean) session.getAttribute("isAdmin");
    if(isAdmin == null || !isAdmin) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<html>
<head>
    <title>Admin Panel</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <h2>Admin Panel</h2>
    <h3>CRUD Operations</h3>
    <ul>
        <li><a href="createUser.jsp">Register New User</a></li>
        <li><a href="modifyUser.jsp">Modify Existing User</a></li>
        <li><a href="deleteUser.jsp">Delete User</a></li>
        <li><a href="searchUser.jsp">Search Users</a></li>
    </ul>
</body>
</html>

