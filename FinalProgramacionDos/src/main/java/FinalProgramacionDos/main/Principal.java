/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProgramacionDos.main;

import FinalProgramacionDos.clasesBeans.Pelicula;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author santi
 */
public class Principal {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("cine");
        EntityManager em1= emf.createEntityManager();
        Pelicula pelicula = em1.find(Pelicula.class, 1);
        System.out.println(pelicula.getId());
        System.out.println(pelicula.getNombre_pelicula());
        System.out.println(pelicula.getDuracion_min());
        System.out.println(pelicula.getSinopsis());
        System.out.println(pelicula.getFechaDeEstreno());
    }
}
