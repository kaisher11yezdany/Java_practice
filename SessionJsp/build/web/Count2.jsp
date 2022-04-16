<%-- 
    Document   : Count2
    Created on : Oct 21, 2018, 7:46:00 PM
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
     String name=(String)session.getAttribute("user");
     out.println("Hello"+name);
%>
<%
     Integer counter=(Integer)application.getAttribute("numberOfVists");
     if(counter==null || counter==0)
     {
        counter=1;
     }
   else
    {
       counter=counter+1;
   }
   application.setAttribute("number of Visits",counter);
%>
<h3> Total Number of visit to this page is:
    <%=counter%>
</h3>
    </body>
</html>
