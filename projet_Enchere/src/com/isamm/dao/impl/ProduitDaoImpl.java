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
		
		System.out.println("entity manager cr��");
		
		
		ProduitDao.insererProduit(p);
		
	}
	
	public final void modifierProduit(Produit p) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		ProduitDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager cr��");
		
		
		ProduitDao.modifierProduit(p);
		
		}
		
		public final void supprimerProduit(Produit p) {
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
			ProduitDao.em  = emf.createEntityManager();
			
			System.out.println("entity manager cr��");
		
			
			ProduitDao.supprimerProduit(p);
			
			}
	
		public final List<Produit> listProduit() {
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
			ProduitDao.em  = emf.createEntityManager();
			
			System.out.println("entity manager cr��");
			
			
			return ProduitDao.listProduits();
			
		}
		
		public final List<Produit> listProduitEncher() {
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
			ProduitDao.em  = emf.createEntityManager();
			
			System.out.println("entity manager cr��");
			
			
			return ProduitDao.listProduitsEncher();
			
		}
		
		public final List<Produit> listProduitNonEncher(int idPersonne) {
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
			ProduitDao.em  = emf.createEntityManager();
			
			System.out.println("entity manager cr��");
			
			
			return ProduitDao.listProduitsNonEncher(idPersonne);
			
		}
		
		public List<Produit> trouverProduit(String libelle)
		{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
			ProduitDao.em  = emf.createEntityManager();
			
			
			return ProduitDao.trouverProduit(libelle);
			
			
		}
		
		public Produit getProduit(int idProd)
		{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
			ProduitDao.em  = emf.createEntityManager();
			
			
			return ProduitDao.getProduit(idProd);
			
			
		}

}
