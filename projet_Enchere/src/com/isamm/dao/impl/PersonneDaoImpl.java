package com.isamm.dao.impl;



import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



import com.isamm.dao.*;
import com.isamm.dao.*;
import com.isamm.domain.*;

public class PersonneDaoImpl {
	
	
	
	
	public final void insererPersonne(Personne p) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		PersonneDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager créé");
		
		
		PersonneDao.insererPersonne(p);
		
	}
	
	public final List <Personne> trouverPersonne(Personne p)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		PersonneDao.em  = emf.createEntityManager();
		
		return PersonneDao.trouverPersonne(p);
	}


	public final void modifierPersonne(Personne p) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		PersonneDao.em  = emf.createEntityManager();
	
		System.out.println("entity manager créé");
	
	
		PersonneDao.modifierPersonne(p);
		
	}
	
	public final void supprimerPersonne(Personne p) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		PersonneDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager créé");
	
		
		PersonneDao.supprimerPersonne(p);
		
	}

}
