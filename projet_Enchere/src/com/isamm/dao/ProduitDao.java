package com.isamm.dao;

import javax.persistence.EntityManager;
import com.isamm.dao.*;
import com.isamm.model.Produit;


public class ProduitDao {

	public static EntityManager em;
	public static void insererProduit(Produit p){
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
	}
	
	public static void modifierProduit(Produit p){
		
		try{
		    em.getTransaction().begin();
		    Produit produit = em.find(Produit.class, p.getIdProduit());
		    produit.setDescription(p.getDescription()); 
		    produit.setLibelle(p.getLibelle());
		    produit.setQuantite_stock(p.getQuantite_stock());
		    em.getTransaction().commit();
		  } finally {
		    em.close();
		    
		  }
		
	}
	
	
	public static void supprimerProduit(Produit p){
		
		try{
		    em.getTransaction().begin();
		    em.remove(p);
		    em.getTransaction().commit();
		  } finally {
		    em.close();
		    
		  }
		
	}

}
