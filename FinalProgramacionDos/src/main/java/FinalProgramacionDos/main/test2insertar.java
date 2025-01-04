/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProgramacionDos.main;

import FinalProgramacionDos.clasesBeans.Pelicula;
import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author santi
 */
public class test2insertar {
    public static void main(String[] args) throws ParseException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("cine");
        EntityManager em1= emf.createEntityManager();
        String fechaEstreno = "2022-05-01";
        SimpleDateFormat fecha= new SimpleDateFormat("yyyy-MM-dd");
        Date fechaPeli = fecha.parse(fechaEstreno);
        Pelicula p1 = new Pelicula(2, 140, "EL JOKER", "PAYASO", "+18", fechaPeli, "Fulano");
        em1.getTransaction().begin();
        em1.persist(p1);
        em1.getTransaction().commit();
    }
}
