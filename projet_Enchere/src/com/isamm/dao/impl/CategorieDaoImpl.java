package com.isamm.dao.impl;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.isamm.dao.*;
import com.isamm.dao.*;
import com.isamm.model.*;

public class CategorieDaoImpl {
	
	
	public final void insererCategorie(Categorie c) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		CategorieDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager créé");
		
		
		CategorieDao.insererCategorie(c);
		assertNotNull(c);
	}


	public final void modifierCategorie(Categorie c) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		CategorieDao.em  = emf.createEntityManager();
	
		System.out.println("entity manager créé");
	
	
		CategorieDao.modifierCategorie(c);
		assertNotNull(c);
	}
	
	public final void supprimerCategorie(Categorie c) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		CategorieDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager créé");
	
		
		CategorieDao.supprimerCategorie(c);
		assertNotNull(c);
		}

}
