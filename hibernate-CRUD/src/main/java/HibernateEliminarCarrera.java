import entidades.Carrera;
import jakarta.persistence.EntityManager;
import utilidades.JpaUtil;

import java.util.Scanner;

public class HibernateEliminarCarrera {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Digite el id de la carrera a eliminar");
        Long id = s.nextLong();
        EntityManager en = JpaUtil.getEntityManagerFactory();

        try{

            Carrera carrera = en.find(Carrera.class,id);
            en.getTransaction().begin();
            en.remove(carrera);
            en.getTransaction().commit();

        }catch (Exception e){
            en.getTransaction().rollback();
            e.printStackTrace();
        }
    }
}
