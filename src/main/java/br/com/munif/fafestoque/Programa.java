/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.munif.fafestoque;

import br.com.munif.fafestoque.entidades.Categoria;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author munifgebarajunior
 */
public class Programa {
    
    private static EntityManagerFactory emf;

    public static void main(String[] args) {
        emf=Persistence.createEntityManagerFactory("UnidadeDePersistencia");
        EntityManager em=emf.createEntityManager();
        System.out.println("Fafestoque");
        
        em.getTransaction().begin();
        Categoria cat=new Categoria();
        cat.setNome("Eletro");
        em.persist(cat);
        em.getTransaction().commit();
        
        
        
    }

}
