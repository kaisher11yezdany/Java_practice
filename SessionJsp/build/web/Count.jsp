<%-- 
    Document   : Count
    Created on : Oct 21, 2018, 7:44:49 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
     String name=request.getParameter("uname");
     String pass=request.getParameter("pass");
     session.setAttribute("user",name);
     out.println("Welcome"+name);
     response.sendRedirect("Count2.jsp");
%>

    </body>
</html>
