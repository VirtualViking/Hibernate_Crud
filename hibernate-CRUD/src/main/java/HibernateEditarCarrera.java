
import entidades.Carrera;
import jakarta.persistence.EntityManager;
import utilidades.JpaUtil;

import javax.swing.*;


public class HibernateEditarCarrera {
    public static void main(String[] args) {

        EntityManager en= JpaUtil.getEntityManagerFactory();

        try{

            Long id=Long.valueOf((JOptionPane.showInputDialog("Ingrese el codigo a modificar: ")));
            Carrera ca = en.find(Carrera.class,id);

            String nombre = JOptionPane.showInputDialog("Ingrese nombre de la carrera ",ca.getNombre());
            String abreviatura = JOptionPane.showInputDialog("Ingrese abreviatura de la carrera ",ca.getAbreviatura());

            en.getTransaction().begin();

            ca.setNombre(nombre);
            ca.setAbreviatura(abreviatura);

            en.merge(ca);

            en.getTransaction().commit();

            System.out.println(ca);


        }catch (Exception e){

            en.getTransaction().rollback();
            System.out.println("Ha habido un error "+e.getMessage());

        }finally {
            en.close();
        }


    }
}
