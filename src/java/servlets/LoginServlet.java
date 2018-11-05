package servlets;

import db.Agents;
import db.AgentsDB;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String username, password; 
        
        username = request.getParameter("username");
        password = request.getParameter("password");
        
        List<Agents> aList = AgentsDB.getAgentByUsernameAndPassword(username, password);
        
        if(!aList.isEmpty())
        {
            RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
            request.setAttribute("username", username);
            rd.forward(request, response);
        } 
        
        else
        {
            System.out.println("Login Failed");
        }
    }
}
