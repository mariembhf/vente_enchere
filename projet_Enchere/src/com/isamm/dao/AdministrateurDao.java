package com.isamm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.isamm.model.*;


public class AdministrateurDao {
	
	public static EntityManager em;
	public static void insererAdministrateur(Administrateur p){
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
	}
	
	public static List <Administrateur> trouverAdministrateur(Administrateur p){
		
		
		Query query = em.createNativeQuery("select * from Personne p where login ='"+p.getLogin()+"' and pwd='"+p.getPwd()+"'",Vendeur.class);
		System.out.println(query.toString());
		//query.setParameter(1, "lePrenom2");
		List <Administrateur> personne =  query.getResultList();
		System.out.println(personne);
		
		return personne;
		
	}
	
	public static void modifierAdministrateur(Administrateur p){
		
		try{
		    em.getTransaction().begin();
		    Administrateur personne = em.find(Administrateur.class, p.getIdPersonne());
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
	
	
	public static void supprimerAdministrateur(Administrateur p){
		
		try{
		    em.getTransaction().begin();
		    em.remove(p);
		    em.getTransaction().commit();
		  } finally {
		    em.close();
		    
		  }
		
	}
	

}
