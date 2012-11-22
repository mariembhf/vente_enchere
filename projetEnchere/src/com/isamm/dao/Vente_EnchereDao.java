package com.isamm.dao;

import javax.persistence.EntityManager;

import com.isamm.model.*;

public class Vente_EnchereDao {

	public static EntityManager em;
	public static void insererVente_Enchere(Vente_Enchere ve){
		
		em.getTransaction().begin();
		em.persist(ve);
		em.getTransaction().commit();
		
	}
	
	public static void modifierVente_Enchere(Vente_Enchere ve){
		
		try{
		    em.getTransaction().begin();
		    Vente_Enchere vente = em.find(Vente_Enchere.class, ve.getIdVente_Enchere());
		    vente.setIdPersonne(ve.getIdPersonne());
		    vente.setIdProduit(ve.getIdProduit());
		    vente.setEtat(ve.getEtat());
		    vente.setPrix_initial(ve.getPrix_initial());
		    em.getTransaction().commit();
		  }
		finally {
		    em.close();
		    
		  }
		
	}
	
	
	public static void supprimerVente_Enchere(Vente_Enchere ve){
		
		try{
		    em.getTransaction().begin();
		    em.remove(ve);
		    em.getTransaction().commit();
		  }
		finally {
		    em.close();
		    
		  }
		
	}
	
}
