package com.isamm.dao;

import javax.persistence.EntityManager;

import com.isamm.domain.*;

public class CategorieDao {
	
	
	public static EntityManager em;
	
	
	public static void insererCategorie(Categorie c){
		
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
	}
	
	public static void modifierCategorie(Categorie c){
		
		try{
		    em.getTransaction().begin();
		    Categorie cat = em.find(Categorie.class, c.getIdCategorie());
		    cat.setLibelleCategorie(c.getLibelleCategorie());
		    em.getTransaction().commit();
		    
		  }
		finally 
		{
		    em.close();
		    
		}
		
	}
	
	
	public static void supprimerCategorie(Categorie c){
		
		try{
		    em.getTransaction().begin();
		    em.remove(c);
		    em.getTransaction().commit();
		  }
		finally 
		{
		    em.close();
		    
		}
		
	}


}
