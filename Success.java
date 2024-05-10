package Mypackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Umesha
 */
@WebServlet(name = "Success", urlPatterns = {"/Success"})
public class Success extends HttpServlet {

          

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("uname");
        out.println("Success "+name );
    }


}
