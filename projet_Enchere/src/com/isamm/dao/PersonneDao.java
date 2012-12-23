package com.isamm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.isamm.domain.*;

public class PersonneDao {

	
	public static EntityManager em;
	public static void insererPersonne(Personne p){
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
	}
	
	public static List <Personne> trouverPersonne(Personne p){
		
		
		Query query = em.createNativeQuery("select * from Personne p where login ='"+p.getLogin()+"' and pwd='"+p.getPwd()+"'",Personne.class);
		System.out.println(query.toString());
		//query.setParameter(1, "lePrenom2");
		List <Personne> personne =  query.getResultList();
		System.out.println(personne);
		
		return personne;
		
	}
	
	public static Personne trouverPersonneParId(int idPersonne){
		
		Personne p=em.find(Personne.class, idPersonne);
		
		return p;
		
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
		
	
		public static void ajouterProduitAPersonne(int idPersonne,Produit produit){
			
			Personne personne = em.find(Personne.class, idPersonne);
			//Produit produit = em.find(Produit.class, idProduit);
			
			
			
			
			System.out.println("dans vendeur dao : le vendeur a un id "+personne.getIdPersonne());
			//System.out.println("dans vendeur dao : le produit a un id "+produit.getIdProduit());
			
			try{
			    em.getTransaction().begin();
			    em.persist(produit);
			    Personne p = em.merge(personne);
			    p.getListeProduits().add(produit);
			    
			    em.getTransaction().commit();
			  } finally {
			    em.close();
			    
			  }
			
			
			
		
	}
	
	
}
