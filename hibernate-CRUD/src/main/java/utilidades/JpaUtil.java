package utilidades;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {

    private static final EntityManagerFactory entityManagerFactory = buildEntityManagerFactory();

    private static EntityManagerFactory buildEntityManagerFactory(){
        return Persistence.createEntityManagerFactory("default"); //Mismo nombre en persistence
    }

    public static EntityManager getEntityManagerFactory(){
        return entityManagerFactory.createEntityManager();
    }
}
