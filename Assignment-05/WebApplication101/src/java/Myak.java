import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Myak extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        try
        {
        int x= Integer.parseInt(req.getParameter("txt1"));
        int y= Integer.parseInt(req.getParameter("txt2"));
        res.setContentType("text/html");
        PrintWriter out= res.getWriter();
        if(req.getParameter("b1")!=null)
        {
            out.println("<h1>Addition Is:</h1>"+(x+y));
        }
        if(req.getParameter("b2")!=null)
        {
            out.println("<h1>Substraction Is:</h1>"+(x-y));
        }
        if(req.getParameter("b3")!=null)
        {
            out.println("<h1>Multiplication Is:</h1>"+(x*y));
        }
        if(req.getParameter("b4")!=null)
        {
            out.println("<h1>Division Is:</h1>"+(x/y));
        }
   
        }
        catch(Exception e)
        {

        }
    }
}