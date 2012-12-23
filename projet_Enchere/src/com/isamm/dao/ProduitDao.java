package com.isamm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.isamm.dao.*;
import com.isamm.domain.Personne;
import com.isamm.domain.Produit;


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
		    em.merge(p);
		    em.getTransaction().commit();
		  } finally {
		    em.close();
		    
		  }
		
	}
	
	
	public static void supprimerProduit(Produit p){
		
		try{
		    em.getTransaction().begin();
		    Produit test = em.merge(p);
		    em.remove(test);
		    em.getTransaction().commit();
		  } finally {
		    em.close();
		    
		  }
		
	}
	
	public static List<Produit> listProduits()
	{
		Query query = em.createNativeQuery("select * from Produit p ",Produit.class);
		System.out.println(query.toString());
		//query.setParameter(1, "lePrenom2");
		List <Produit> produit =  query.getResultList();
		//System.out.println(personne);
		
		return produit;
	}
	
	public static List<Produit> listProduitsEncher()
	{
		Query query = em.createNativeQuery("select * from Produit p where p.etat='encher' ",Produit.class);
		System.out.println(query.toString());
		List <Produit> produit =  query.getResultList();
		
		
		return produit;
	}
	
	public static List<Produit> listProduitsNonEncher(int idPersonne)
	{
		
		//autrement
		Personne p=em.find(Personne.class, idPersonne);
		List <Produit> produit= p.getListeProduits();
		
		
		/*
		Query query = em.createNativeQuery("select * from Produit p where p.etat='nonencher' ",Produit.class);
		System.out.println(query.toString());
		List <Produit> produit =  query.getResultList();
		*/
		
		
		return produit;
	}
	
	public static List<Produit> trouverProduit(String libelle)
	{
		Query query = em.createNativeQuery("select * from Produit p where p.libelle='"+libelle+"' ",Produit.class);
		List <Produit> p = query.getResultList();
		return p;
	}

}
