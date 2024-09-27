
import entidades.Carrera;
import jakarta.persistence.EntityManager;
import utilidades.JpaUtil;

import java.util.List;


public class HibernateListarCarrera {

    public static void main(String[] args) {

        EntityManager en = JpaUtil.getEntityManagerFactory();
        List<Carrera> carreras = en.createQuery("select c from Carrera c",Carrera.class).getResultList();
        carreras.forEach(System.out::println);

    }
}
