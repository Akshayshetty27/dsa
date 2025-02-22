<%-- 
    Document   : newjsp
    Created on : 22-Feb-2025, 9:33:29 am
    Author     : shett
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            
Class.forName("com.mysql.jdbc.driver");
Connection con = DriverManager.getConnection("Url","username","password");
     Statement st = con.createStatement();
%>
    </body>
</html>


