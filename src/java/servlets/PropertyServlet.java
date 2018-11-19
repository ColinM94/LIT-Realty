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
        List<Property> properties = PropertyDB.getAllProperties();
        request.setAttribute("properties", properties);
        
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
        
        /*
        // Get property id.
        int id = Integer.parseInt(request.getParameter("id"));

        Property property = PropertyDB.getPropertyById(id);
        
        request.setAttribute("id", property.getId());
        request.setAttribute("street", property.getStreet());
        request.setAttribute("city", property.getCity());
        request.setAttribute("bedrooms", property.getBedrooms());
        request.setAttribute("bathrooms", property.getBathrooms());
        request.setAttribute("squareFeet", property.getSquareFeet());
        request.setAttribute("ber", property.getBerRating());
        request.setAttribute("lotSize", property.getLotSize());
        request.setAttribute("price", property.getPrice());
        */
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
