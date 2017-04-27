/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservation.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Test;
import static org.junit.Assert.*;
import reservation.entity.Adresse;
import reservation.entity.Chambre;
import reservation.entity.Client;

import reservation.entity.Hotel;
import reservation.entity.Rservation;

/**
 *
 * @author formation
 */
public class JPATest {
    
     @Test

    public void clientreservation() {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
//        Chambre cl = new Chambre();
//        Rservation res = new Rservation();
//        
        
       

      

        

    }
    
    
//    
//    @Test
//
//    public void clientreservation() {
//
//        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//        
//        Client cl = em.find(Client.class, 1L);
//
//      
//
//        System.out.print(String.format( "nom=%s",cl.getHs()));
//
//    }

   // @Test

    public void rescuperer() {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        Chambre chambre = em.find(Chambre.class, 1L);

        System.out.print(String.format("Chambre :id=%d nom=%s prix =%9.2f hotel=%s",
                chambre.getid(), chambre.getNom(), chambre.getPrix(), chambre.getHotel().getNom()));

    }

//    @Test
    public void ajouterChambre() {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        Chambre c = new Chambre();
        c.setNom("Suite Royal");
        c.setPrix(200000.0);

        c.setDescription("c pas cher");
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();

    }

//    @Test
    public void ajouterhotel() {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        Hotel c = new Hotel();
        Adresse ad = new Adresse();

        c.setNom("Hotel OURIACHI");

        ad.setLacoalite("KABYLIE");
        ad.setPays("ALGERIE");
        ad.setPostale(15110L);
        ad.setRue("AHMED");
        c.setAdr(ad);

        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();

    }

}
