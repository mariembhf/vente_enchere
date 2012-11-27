package com.isamm.dao.impl;



import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



import com.isamm.dao.*;
import com.isamm.model.*;


public class ProduitDaoImpl {
	
	
	
	
	public final void insererProduit(Produit p) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		ProduitDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager créé");
		
		
		ProduitDao.insererProduit(p);
		
	}
	
	public final void modifierProduit(Produit p) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		ProduitDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager créé");
		
		
		ProduitDao.modifierProduit(p);
		
		}
		
		public final void supprimerProduit(Produit p) {
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
			ProduitDao.em  = emf.createEntityManager();
			
			System.out.println("entity manager créé");
		
			
			ProduitDao.supprimerProduit(p);
			
			}
	
	

}
