<%-- 
    Document   : Index
    Created on : May 8, 2024, 8:31:45 AM
    Author     : Umesha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <!--<form action="LoginServlet" method="get">
        <label for="username">Username:</label><br>
        <input type="text" id="username" name="username"><br>
        <label for="password">Password:</label><br>
        <input type="password" id="password" name="password"><br>
        <input type="submit" value="Submit">
    </form>-->
    
    <form action ="LoginServlet" method="POST">
        User Name: <input type="text" name="uname"><br><br>
        Password: <input type="password" name="pwd"><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
