package com.isamm.dao.impl;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.isamm.dao.*;
import com.isamm.model.*;

public class AdministrateurDaoImpl {
	
	
public final void insererAdministrateur(Administrateur p) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		AdministrateurDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager créé");
		
		
		AdministrateurDao.insererAdministrateur(p);
		
	}
	
	public final List <Administrateur> trouverAdministrateur(Administrateur p)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		AdministrateurDao.em  = emf.createEntityManager();
		
		return AdministrateurDao.trouverAdministrateur(p);
	}


	public final void modifierAdministrateur(Administrateur p) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		AdministrateurDao.em  = emf.createEntityManager();
	
		System.out.println("entity manager créé");
	
	
		AdministrateurDao.modifierAdministrateur(p);
		
	}
	
	public final void supprimerAdministrateur(Administrateur p) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		AdministrateurDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager créé");
	
		
		AdministrateurDao.supprimerAdministrateur(p);
		
	}


}
