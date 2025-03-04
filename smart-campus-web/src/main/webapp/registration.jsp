<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Registration</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 20px;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }
        .container {
            background-color: white;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            padding: 40px;
            width: 300px;
            text-align: center;
        }
        h2 {
            margin-bottom: 20px;
            color: #333;
        }
        input[type="text"], input[type="email"], input[type="submit"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ddd;
            border-radius: 5px;
            box-sizing: border-box; /* Ensures padding is included in total width */
        }
        input[type="submit"] {
            background-color: #5cb85c;
            color: white;
            font-weight: bold;
            cursor: pointer;
            transition: background-color 0.3s;
        }
        input[type="submit"]:hover {
            background-color: #4cae4c;
        }
        .footer {
            margin-top: 20px;
            font-size: 0.8em;
            color: #777;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Student Registration Form</h2>
    <form action="postServlet" method="POST">
        <input type="text" name="firstName" placeholder="First Name" required/>
        <input type="text" name="lastName" placeholder="Last Name" required/>
        <input type="email" name="email" placeholder="Email" required/>
        <input type="submit" value="Register"/>
    </form>

    <h3>Demo GET Form</h3>
    <form action="getServlet" method="GET">
        <input type="text" name="query" placeholder="Enter your query"/>
        <input type="submit" value="Submit GET"/>
    </form>

    <div class="footer">
        <p>Project for Advanced Internet Programming - Semester 2</p>
        <p>Created by Mannu Mourya (24MCA20294)</p>
    </div>
</div>
</body>
</html>
