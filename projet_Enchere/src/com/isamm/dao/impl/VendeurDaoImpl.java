package com.isamm.dao.impl;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.isamm.dao.*;
import com.isamm.model.*;

public class VendeurDaoImpl {
	
	public final void insererVendeur(Vendeur p) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		VendeurDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager créé");
		
		
		VendeurDao.insererVendeur(p);
		
	}
	
	public final List <Vendeur> trouverVendeur(Vendeur p)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		VendeurDao.em  = emf.createEntityManager();
		
		return VendeurDao.trouverVendeur(p);
	}


	public final void modifierVendeur(Vendeur p) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		VendeurDao.em  = emf.createEntityManager();
	
		System.out.println("entity manager créé");
	
	
		VendeurDao.modifierVendeur(p);
		
	}
	
	public final void supprimerVendeur(Vendeur p) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		VendeurDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager créé");
	
		
		VendeurDao.supprimerVendeur(p);
		
	}

}
