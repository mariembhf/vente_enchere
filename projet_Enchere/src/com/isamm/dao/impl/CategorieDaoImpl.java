package com.isamm.dao.impl;



import java.util.Date;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.isamm.dao.*;
import com.isamm.dao.*;
import com.isamm.domain.*;

public class CategorieDaoImpl {
	
	
	public final void insererCategorie(Categorie c) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		CategorieDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager créé");
		
		
		CategorieDao.insererCategorie(c);
		
	}


	public final void modifierCategorie(Categorie c) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		CategorieDao.em  = emf.createEntityManager();
	
		System.out.println("entity manager créé");
	
	
		CategorieDao.modifierCategorie(c);
		
	}
	
	public final void supprimerCategorie(Categorie c) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		CategorieDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager créé");
	
		
		CategorieDao.supprimerCategorie(c);
		
		}

}
