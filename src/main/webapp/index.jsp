<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            padding: 20px;
            text-align: center;
        }
        h1 {
            color: #008080;
        }
        p {
            margin-top: 20px;
            font-size: 18px;
        }
        a {
            color: #0000FF;
            text-decoration: none;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<p>This is a simple JSP project to demonstrate "Hello World" using JSP and servlets.</p>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>
