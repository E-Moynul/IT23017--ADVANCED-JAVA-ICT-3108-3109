<%-- 
    Document   : index
    Created on : Feb 16, 2026, 12:53:15 PM
    Author     : moynul
--%>

<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Department Management System</title>
    </head>
    <body style="text-align: center; font-family: sans-serif;">
        <h2>Add New Department</h2>


        <div style="color: blue; margin-bottom: 20px;">
            <strong>Current Date & Time: </strong>
            <%= LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) %>
        </div>

        <form action="TestServlet" method="POST">
            Department Name: <input type="text" name="dept_name" required><br><br>
            Number of Students: <input type="number" name="num_students" required><br><br>
            <input type="submit" value="Save Information">
        </form>
    </body>
</html>