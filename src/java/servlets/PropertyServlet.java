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
        String requestType = "";
        
        // Gets request type. 
        if(request.getAttribute("requestType") != null)
            requestType = (String) request.getAttribute("requestType");
        

        else if(request.getParameter("requestType") != null)
            requestType = (String) request.getParameter("requestType");
                  
        
        System.out.print("\n\n\n Debugging: " + requestType + "\n\n\n");
        
        switch (requestType) 
        {
            case "property":
            {
                int id = Integer.parseInt(request.getParameter("id"));
                Property property = PropertyDB.getPropertyById(id);
                request.setAttribute("property", property);
                RequestDispatcher rd = request.getRequestDispatcher("property.jsp");
                rd.forward(request, response);
                break;
            }
            case "allProperties":
            {
                List<Property> properties = PropertyDB.getAllProperties();
                request.setAttribute("properties", properties);
                RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
                rd.forward(request, response);    
                break;
            }
            case "add":
            {                  

                                
                Property property = new Property();
                property.setStreet(request.getParameter("street"));
                property.setCity(request.getParameter("city"));
                property.setListingNum(Integer.parseInt(request.getParameter("listingNum")));
                property.setStyleId(Integer.parseInt(request.getParameter("style")));
                property.setTypeId(Integer.parseInt(request.getParameter("type")));
                property.setBedrooms(Integer.parseInt(request.getParameter("bedrooms")));
                property.setBathrooms(Integer.parseInt(request.getParameter("bathrooms")));
                property.setSquareFeet(Integer.parseInt(request.getParameter("squareFeet")));
                property.setBerRating(request.getParameter("berRating"));
                property.setDescription(request.getParameter("description"));
                property.setLotSize(request.getParameter("lotSize"));
                property.setGarageSize(Integer.parseInt(request.getParameter("garageSize")));
                property.setGarageId(Integer.parseInt(request.getParameter("garage")));
                property.setAgentId(Integer.parseInt(request.getParameter("agent")));
                property.setPrice(Float.valueOf(request.getParameter("price")));
                property.setDateAdded("2018-11-27");
                
                PropertyDB.addProperty(property);
                
                RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
                rd.forward(request, response);   
                break;
            }
            case "delete":
            {
                int id = Integer.parseInt(request.getParameter("id"));
                PropertyDB.removeProperty(id);
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);
                break;
            }
            case "update":
            {
                break;   
            }
            case "":
            {
                System.out.print("Empty Request");
            }
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
