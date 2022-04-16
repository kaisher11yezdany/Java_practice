

<%@page contentType="text/html" pageEncoding="UTF-8" import="pack.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="#" method="post">
           Enter 1st string<input type="text" name="str1"><br>
           ENTER 2nd String <input type="text" name="str2"><br>
            <input type="submit" value="Submit" name="btn1">
            <input type="reset" value ="Reset" name="btn2">
          </form>
        <%! String st1=null,st2=null;%>
        <%
        st1=request.getParameter("str1");
        st2=request.getParameter("str2");
            if(st1!=null && st2!=null)
           {
        EjbstrareBean e=new EjbstrareBean();
        out.println("String Concate="+e.concate(st1,st2));
        out.println("String Length="+e.length(st1));
        out.println("String To Upper="+e.touper(st1));
        out.println("String Lower="+e.tolower(st1));
            }
        %><br>

    </body>
</html>
