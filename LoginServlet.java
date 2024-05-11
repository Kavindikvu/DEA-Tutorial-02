
package Mypackage;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

       
        response.getWriter().println("Welcome "+username);
        
        
      
    }
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
       String name = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
        
       // response.getWriter().println("Welcome "+name);
      
        if(name.equals("Umesha") || pwd.equals("123")){
            RequestDispatcher rd = request.getRequestDispatcher("Success");
            rd.forward(request, response);
        }
        
        else{
            out.println("Sorry your username and password incorrect");
            RequestDispatcher rd = request.getRequestDispatcher("/Index.jsp");
            rd.include(request, response);
        }
    }

    
}
