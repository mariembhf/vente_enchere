package com.isamm.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.isamm.model.*;

public class VendeurDao {

	
	public static EntityManager em;
	public static void insererVendeur(Vendeur p){
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
	}
	
	public static List <Vendeur> trouverVendeur(Vendeur p){
		
		
		Query query = em.createNativeQuery("select * from Personne p where login ='"+p.getLogin()+"' and pwd='"+p.getPwd()+"'",Vendeur.class);
		System.out.println(query.toString());
		//query.setParameter(1, "lePrenom2");
		List <Vendeur> personne =  query.getResultList();
		System.out.println(personne);
		
		return personne;
		
	}
	
	public static void modifierVendeur(Vendeur p){
		
		try{
		    em.getTransaction().begin();
		    Vendeur personne = em.find(Vendeur.class, p.getIdPersonne());
		    personne.setLogin(p.getLogin()); 
		    personne.setPwd(p.getPwd());
		    personne.setAdresse(p.getAdresse());
		    personne.setMail(p.getMail());
		    em.getTransaction().commit();
		  }
		finally {
		    em.close();
		    
		  }
		
	}
	
	
	public static void supprimerVendeur(Vendeur p){
		
		try{
		    em.getTransaction().begin();
		    em.remove(p);
		    em.getTransaction().commit();
		  } finally {
		    em.close();
		    
		  }
		
	}

	
	
}
