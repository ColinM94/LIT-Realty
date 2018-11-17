package db;

import java.util.List;
import java.util.Properties;
import javax.persistence.EntityManager;

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
        
        return em.createQuery("SELECT p FROM Property p", Property.class).getResultList();
    }
}
