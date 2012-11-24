package com.isamm.dao.impl;

import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.isamm.dao.*;
import com.isamm.dao.*;
import com.isamm.model.*;

public class PersonneDaoImpl {
	
	public final void insererPersonne(Personne p) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		ProduitDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager créé");
		
		
		PersonneDao.insererPersonne(p);
		assertNotNull(p);
	}


	public final void modifierPersonne(Personne p) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
	ProduitDao.em  = emf.createEntityManager();
	
	System.out.println("entity manager créé");
	
	
	PersonneDao.modifierPersonne(p);
	assertNotNull(p);
	}
	
	public final void supprimerPersonne(Personne p) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		ProduitDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager créé");
	
		
		PersonneDao.supprimerPersonne(p);
		assertNotNull(p);
		}

}
