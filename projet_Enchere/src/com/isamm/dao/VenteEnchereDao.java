package com.isamm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.isamm.domain.*;

public class VenteEnchereDao {

	public static EntityManager em;
	public static void insererVente_Enchere(VenteEnchere ve){
		
		em.getTransaction().begin();
		em.persist(ve);
		em.getTransaction().commit();
		
	}
	
	public static void modifierVente_Enchere(VenteEnchere ve){
		
		try{
		    em.getTransaction().begin();
		    VenteEnchere vente = em.find(VenteEnchere.class, ve.getIdVente_Enchere());
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
	
	
	public static void supprimerVente_Enchere(VenteEnchere ve){
		
		try{
		    em.getTransaction().begin();
		    em.remove(ve);
		    em.getTransaction().commit();
		  }
		finally {
		    em.close();
		    
		  }
		
	}
	
	
	public static List <VenteEnchere> trouverVE(int idProd)
	{
		Query query = em.createNativeQuery("select * from VenteEnchere v where v.idProduit='"+idProd+"' and v.etat='encour' ",VenteEnchere.class);
		List <VenteEnchere> ve =  query.getResultList();
		return ve;
	}
	
}
