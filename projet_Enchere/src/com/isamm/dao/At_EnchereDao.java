package com.isamm.dao;

import javax.persistence.EntityManager;

import com.isamm.model.*;

public class At_EnchereDao {
	
	public static EntityManager em;
	
	public static void insererAt_Enchere(At_Enchere ae){
		
		em.getTransaction().begin();
		em.persist(ae);
		em.getTransaction().commit();
		
	}
	
	public static void modifierAt_Enchere(At_Enchere ae){
		
		try{
		    em.getTransaction().begin();
		    At_Enchere ate = em.find(At_Enchere.class, ae.getIdAt_Enchere());
		    ate.setIdEnchereur(ae.getIdEnchereur());
		    ate.setIdProduit(ae.getIdProduit());
		    ate.setPrix_propose(ae.getPrix_propose());
		    ate.setDate(ae.getDate());
		    em.getTransaction().commit();
		    
		  }
		finally 
		{
		    em.close();
		    
		}
		
	}
	
	
	public static void supprimerAt_Enchere(At_Enchere ae){
		
		try{
		    em.getTransaction().begin();
		    em.remove(ae);
		    em.getTransaction().commit();
		  }
		finally 
		{
		    em.close();
		    
		}
		
	}



}
