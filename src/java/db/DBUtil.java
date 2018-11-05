package db;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil 
{
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("LITRealtyPU");

    public static EntityManagerFactory getEmf() 
    {
        return emf;
    }
}
