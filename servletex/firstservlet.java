import java.io.*;
 
 import jakarta.servlet.http.*;
 public class firstservlet  extends HttpServlet
 {
                                             
     public  void service(HttpServletRequest request,HttpServletResponse response)
     {
        try
        {
             //object Print write
               PrintWriter out=response.getWriter();
             // what my server to respond
               out.println(" welcome to servelet example 1");
               out.println(" welcome to servelet example 2");
        }
        catch(Exception e)
        {
        }
     }
 }
 