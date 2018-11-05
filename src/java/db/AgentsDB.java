package db;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
    
public class AgentsDB
{
    public static Agents getAgentsById(String agentId)
    {
        EntityManager em = DBUtil.getEmf().createEntityManager();

        return em.find(Agents.class, agentId);
    }
    
    public static List<Agents> getAgentByUsernameAndPassword(String username, String password) 
    {
        EntityManager em = DBUtil.getEmf().createEntityManager();

        TypedQuery<Agents> tq = em.createNamedQuery("Agents.findAgent", Agents.class);
        tq.setParameter("username", username);
        tq.setParameter("password", password);

        System.out.println(tq);
        
        List<Agents> aList;      
        try
        {
            aList = tq.getResultList();
        }
        finally
        {
            em.close();
        }

        return aList;
    }
    
    public static void editAgents(Agents a)
    {
        EntityManager em = DBUtil.getEmf().createEntityManager();
        
        EntityTransaction trans = em.getTransaction();
        
        try 
        {
            trans.begin();
            em.merge(a);
            trans.commit();
        } 
        catch (Exception ex) 
        {
            System.out.println(ex);
        }
         
        em.close();
    }
    
    public static List<Agents> getAllAgents()
    {
        EntityManager em = DBUtil.getEmf().createEntityManager();
        
        TypedQuery<Agents> tq = em.createNamedQuery("Agents.findAll", Agents.class);
        
        List<Agents> aList;
        try
        {
            aList = tq.getResultList();
        }
        finally
        {
            em.close();
        }
        
        return aList;
    }
    
    public static void removePassengers(Agents a) 
    {
        // Do delete code.
    }
    
    public static void addPassengers(Agents a) 
    {
        // Do insert code.
    }
}
