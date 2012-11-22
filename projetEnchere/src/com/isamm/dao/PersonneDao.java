package com.isamm.dao;

import javax.persistence.EntityManager;

import com.isamm.model.*;

public class PersonneDao {

	
	public static EntityManager em;
	public static void insererPersonne(Personne p){
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
	}
	
	public static void modifierPersonne(Personne p){
		
		try{
		    em.getTransaction().begin();
		    Personne personne = em.find(Personne.class, p.getIdPersonne());
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
	
	
	public static void supprimerPersonne(Personne p){
		
		try{
		    em.getTransaction().begin();
		    em.remove(p);
		    em.getTransaction().commit();
		  } finally {
		    em.close();
		    
		  }
		
	}

	
	
}
