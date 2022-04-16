<%-- 
    Document   : Mainjsp
    Created on : Oct 7, 2018, 5:19:17 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        
        
        <h1> Math Using JSP! </h1>
        <%! int no=0; int i;
        int fact=1;
        %>
        <% no=Integer.parseInt(request.getParameter("t1"));%>
        <h2> FACTORIAL NO IS:</h2>
        <%
            for( int i=1;i<=no;i++)
            {
                fact=fact*i;
            }
        %>
        <h1> Factorial=<%=fact%></h1>
        <h2> EVEN OR ODD IS:</h2>
        <%
            if(no%2==0)
            {
        %>
        <h4> Number Is Even:</h4>
        <%
            }else

           {
        %>
              <h4> Number Is Odd:</h4>
              <%
            }
              %>
              <h2> Multiplication Table for the<%=no%> is:</h2>
              <table>
                  <% 
                      for(int i=1;i<=10;i++)
                      {
                  %>
                  <tr>
                      <td><%=no%></td>
                      <td>*</td>
                      <td><%=i%></td>
                      <td>=</td>
                      <td><%=i*no%></td>
                  </tr>
                  <%
                     }
                  %>
              </table>
    </body>    
    
</html>
