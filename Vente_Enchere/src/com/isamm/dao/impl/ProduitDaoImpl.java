package com.isamm.dao.impl;

import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

import com.isamm.dao.*;
import com.isamm.model.*;


public class ProduitDaoImpl {
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
		ProduitDao.em  = emf.createEntityManager();
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	public final void insererProduit() {
		Produit p = new Produit();
		p.setLibelle("xxxxx");
		p.setDescription("description");
		p.setQuantite_stock(20);
		ProduitDao.insererProduit(p);
		assertNotNull(p);
	}
	
	
	
	

}
