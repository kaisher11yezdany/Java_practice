


/*******************************************
Name:Swapnil Shewale      Roll no:22
 *******************************************/
//CookieColor1.java       to send cookies
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieColor1 extends HttpServlet
{
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
   {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try
        {
            String c=request.getParameter("selectcoll");
            Cookie c1 = new Cookie("color",c);
            c1.setMaxAge(24*60*60);
            response.addCookie(c1);

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CookieColor1</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> <a href=CookieColor2>Go to Next page</a> </h1>");
            out.println("</body>"); //can be done without <a> tag
            out.println("</html>");
         
          
        }
        finally
        {
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
