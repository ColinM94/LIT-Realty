package servlets;

import db.Property;
import db.PropertyDB;
import java.io.IOException;
import java.util.List;
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
        String type = "";
        
        // Checks if request was sent from a form or RequestDispatcher.
        if(request.getAttribute("type") != null)
            type = (String) request.getAttribute("type");
        
        // Checks if request was sent from a html link.
        else if(request.getParameter("type") != null)
            type = (String) request.getParameter("type");
                    
        if(type.equals("allProperties"))
        {
            List<Property> properties = PropertyDB.getAllProperties();
            request.setAttribute("properties", properties);

            RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
            rd.forward(request, response);
        }
        
        else if(type.equals("property"))
        {
            int id = Integer.parseInt(request.getParameter("id"));
            
            Property property = PropertyDB.getPropertyById(id);
            request.setAttribute("property", property);
            
            RequestDispatcher rd = request.getRequestDispatcher("property.jsp");
            rd.forward(request, response);
        }
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
