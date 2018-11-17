package servlets;

import db.Property;
import db.PropertyDB;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PropertyServlet", urlPatterns = {"/PropertyServlet"})
public class PropertyServlet extends HttpServlet
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        // Get property id.
        int id = Integer.parseInt(request.getParameter("id"));

        Property property = PropertyDB.getPropertyById(id);
        
        request.setAttribute("id", property.getId());
        request.setAttribute("city", property.getCity());
        
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
    }
        
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        processRequest(request, response);
    }
}
