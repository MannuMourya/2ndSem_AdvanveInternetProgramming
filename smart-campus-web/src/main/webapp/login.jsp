<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Login | AIP Project</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .login-container {
            background-color: white;
            padding: 2rem;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            width: 300px;
        }
        h2 {
            color: #333;
            text-align: center;
            margin-bottom: 1.5rem;
        }
        form {
            display: flex;
            flex-direction: column;
        }
        input {
            margin-bottom: 1rem;
            padding: 0.5rem;
            border: 1px solid #ddd;
            border-radius: 4px;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            cursor: pointer;
            transition: background-color 0.3s;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
        .error {
            color: #ff0000;
            text-align: center;
            margin-top: 1rem;
        }
        .project-info {
            text-align: center;
            font-size: 0.8rem;
            color: #666;
            margin-top: 1rem;
        }
    </style>
</head>
<body>
<div class="login-container">
    <h2>Admin Login</h2>
    <form action="admin" method="POST">
        <input type="text" name="username" placeholder="Username" required/>
        <input type="password" name="password" placeholder="Password" required/>
        <input type="submit" value="Login"/>
    </form>
    <% if(request.getParameter("error") != null) { %>
    <p class="error"><%= request.getParameter("error") %></p>
    <% } %>
    <div class="project-info">
        <p>Advanced Internet Programming - Semester 2 Project</p>
        <p>Created by Mannu Mourya (24MCA20294)</p>
    </div>
</div>
</body>
</html>
