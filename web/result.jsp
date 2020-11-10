<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Product succesfully added</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <h1 align="center">Your product successfully added</h1>
        <%
            List styles = (List)request.getAttribute("styles");
            Iterator it = styles.iterator();
            out.print("<h2><br>name: " + it.next());
            out.print("<br>barcode: " + it.next());
            out.print("<br>color: " + it.next());
            out.print("<br>desc: " + it.next());
             out.print("</h2>");
        %> 
        <center><button><a href="index.html">Click here to add another product</a></button></center> 
       
    </body>
</html>
