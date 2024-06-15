/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package sample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "response", urlPatterns = {"/response"})
public class response extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<h1>Hello, This is doGetMethod</h1>");
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        response.setContentType("text/html;charset=UTF-8");
        
        String first = request.getParameter("first");
        String last = request.getParameter("last");
        String email = request.getParameter("email");
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Reading three request parameters</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<style>");
            out.println("p {");        // note leading brace
            out.println("font-size: 20px");
            out.println("}");  
            out.println("h1 {");        // note leading brace
            out.println("color: #407A79;");
            out.println("}");  
            out.println("h3 {");        // note leading brace
            out.println("font: medium");
            out.println("}");
            out.println("buttons {");
            out.println("gap: 2rem");
            out.println("display: flex");
            out.println("align-items: center");
            out.println("margin-bottom: 20px");
            out.println("}");
            out.println("</style>");
            out.println("<h1>Thank you for joining our email list</h1>");
            out.println("<h2>Here is the information that you entered:</h2>");
            out.println("<div>Email : " + email + "</div>");
            out.println("<div>First name : " + first + "</div>");
            out.println("<div>Last name : " + last + "</div>");
            out.println("<p>To enter another email address, click on the Back button in your browser or the Return button shown below.</p>");
            out.println("<form action= index.jsp method=get>");
            out.println("<button type= submit >Return</button>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
           
        }
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
