package db;

import java.util.List;
import java.util.Properties;
import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;

public class PropertyDB 
{
    public static Property getPropertyById(int id)
    {
        EntityManager em = DBUtil.getEmf().createEntityManager();
        
        return em.find(Property.class, id);
    }
    
    public static List<Property> getAllProperties()
    {
        EntityManager em = DBUtil.getEmf().createEntityManager();
        
        return em.createNamedQuery("Property.findAll", Property.class).getResultList();
    }
    
    public static void removeProperty(int id)
    {
        EntityManager em = DBUtil.getEmf().createEntityManager();
        
        Property property = em.find(Property.class, id);

        em.getTransaction().begin();
        em.remove(property);
        em.getTransaction().commit();
    }
    
    public static void addProperty(Property property)
    {
       EntityManager em = DBUtil.getEmf().createEntityManager();
       
       em.getTransaction().begin();
       em.persist(property);        
       em.getTransaction().commit();
    }
}
