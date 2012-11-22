package com.isamm.dao.impl;

import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.isamm.dao.*;
import com.isamm.dao.*;
import com.isamm.model.*;

public class Vente_EnchereDaoImpl {
	
	
	public final void insererVente_Enchere(Vente_Enchere ve) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		ProduitDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager créé");
		
		
		Vente_EnchereDao.insererVente_Enchere(ve);
		assertNotNull(ve);
	}


	public final void modifierVente_Enchere(Vente_Enchere ve) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
	ProduitDao.em  = emf.createEntityManager();
	
	System.out.println("entity manager créé");
	
	
	Vente_EnchereDao.modifierVente_Enchere(ve);
	assertNotNull(ve);
	}
	
	public final void supprimerVente_Enchere(Vente_Enchere ve) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		ProduitDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager créé");
	
		
		Vente_EnchereDao.supprimerVente_Enchere(ve);
		assertNotNull(ve);
		}


}
