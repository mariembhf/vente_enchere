package com.isamm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.isamm.model.*;

public class PersonneDao {

	
	public static EntityManager em;
	public static void insererPersonne(Personne p){
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
	}
	
	public static Personne trouverPersonne(Personne p){
		
		em.getTransaction().begin();
		
		em.persist(p);
		em.getTransaction().commit();
		
		
		Query query = em.createNativeQuery("select * from Personne p where login ='"+p.getLogin()+"' and pwd='"+p.getPwd()+"'",Personne.class);
		//query.setParameter(1, "lePrenom2");
		Personne personne = (Personne) query.getSingleResult();
		System.out.println(personne);
		
		return personne;
		
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
