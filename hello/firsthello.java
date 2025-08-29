import java.io.*;
 
 import jakarta.servlet.http.*;
 public class firsthello  extends HttpServlet
 {
                                             
     public  void service(HttpServletRequest request,HttpServletResponse response)
     {
        try
        {
             //object Print write
               PrintWriter out=response.getWriter();
             // what my server to respond
               out.println(" welcome to servlet ");
               out.println(" Hello world!");
        }
        catch(Exception e)
        {
        }
     }
 }
 