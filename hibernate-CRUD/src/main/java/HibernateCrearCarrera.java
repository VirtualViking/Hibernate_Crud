
import entidades.Carrera;
import jakarta.persistence.EntityManager;
import utilidades.JpaUtil;

import javax.swing.*;

public class HibernateCrearCarrera {
    public static void main(String[] args) {

        EntityManager en = JpaUtil.getEntityManagerFactory();

        try{

            String nombre= JOptionPane.showInputDialog("Ingrese nombre de la carrera");
            String abreviatura=JOptionPane.showInputDialog("Digite la sigla de la carrera");

            en.getTransaction().begin();

            Carrera ca = new Carrera();
            ca.setNombre(nombre);
            ca.setAbreviatura(abreviatura);

            en.persist(ca);

            en.getTransaction().commit();

            System.out.println("El nuevo codigo de la carrera es: "+ca.getId());

            ca=en.find(Carrera.class,ca.getId());
            System.out.println(ca);


        }catch (Exception e){

            en.getTransaction().rollback();

            e.printStackTrace();
        }finally{
            en.close();
        }
    }

}
