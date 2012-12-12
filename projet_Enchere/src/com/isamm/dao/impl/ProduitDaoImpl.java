package com.isamm.dao.impl;



import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



import com.isamm.dao.*;
import com.isamm.domain.*;


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
	
		public final List<Produit> listProduit() {
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
			ProduitDao.em  = emf.createEntityManager();
			
			System.out.println("entity manager créé");
			
			
			return ProduitDao.listProduits();
			
		}

}
