<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Registration</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <h2>Student Registration Form</h2>
    <form action="postServlet" method="POST">
        First Name: <input type="text" name="firstName" required/><br/>
        Last Name: <input type="text" name="lastName" required/><br/>
        Email: <input type="email" name="email" required/><br/>
        <input type="submit" value="Register"/>
    </form>
    <h3>Demo GET Form</h3>
    <form action="getServlet" method="GET">
        Query: <input type="text" name="query"/><br/>
        <input type="submit" value="Submit GET"/>
    </form>
</body>
</html>

