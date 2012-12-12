package com.isamm.dao.impl;



import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



import com.isamm.dao.*;
import com.isamm.domain.*;


public class EnchereurDaoImpl {
	
	
	
	
	public final void insererEnchereur(Enchereur p) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		EnchereurDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager créé");
		
		
		EnchereurDao.insererEnchereur(p);
		
	}
	
	public final void modifierEnchereur(Enchereur p) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		EnchereurDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager créé");
		
		
		EnchereurDao.modifierEnchereur(p);
		
		}
		
	public final List <Enchereur> trouverEnchereur(Enchereur p)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		EnchereurDao.em  = emf.createEntityManager();
		
		return EnchereurDao.trouverEnchereur(p);
	}

	
		public final void supprimerEnchereur(Enchereur p) {
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
			EnchereurDao.em  = emf.createEntityManager();
			
			System.out.println("entity manager créé");
		
			
			EnchereurDao.supprimerEnchereur(p);
			
			}
	
	

}
