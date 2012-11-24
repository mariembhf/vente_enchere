package com.isamm.dao.impl;

import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

import com.isamm.dao.*;
import com.isamm.dao.*;
import com.isamm.model.*;

public class PersonneDaoImpl {
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		PersonneDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager cr��");
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	public final void insererPersonne(Personne p) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		PersonneDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager cr��");
		
		
		PersonneDao.insererPersonne(p);
		assertNotNull(p);
	}


	public final void modifierPersonne(Personne p) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		PersonneDao.em  = emf.createEntityManager();
	
		System.out.println("entity manager cr��");
	
	
		PersonneDao.modifierPersonne(p);
		assertNotNull(p);
	}
	
	public final void supprimerPersonne(Personne p) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		PersonneDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager cr��");
	
		
		PersonneDao.supprimerPersonne(p);
		assertNotNull(p);
	}

}
