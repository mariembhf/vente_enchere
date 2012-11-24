package com.isamm.dao.impl;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.isamm.dao.*;
import com.isamm.model.*;

public class At_EnchereDaoImpl {

public final void insererAt_Enchere() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		At_EnchereDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager créé");
		
		At_Enchere ae = new At_Enchere();
		ae.setDate(new Date());
		At_EnchereDao.insererAt_Enchere(ae);
		assertNotNull(ae);
	}


	public final void modifierAt_Enchere(At_Enchere ae) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		At_EnchereDao.em  = emf.createEntityManager();
	
		System.out.println("entity manager créé");
	
	
		At_EnchereDao.modifierAt_Enchere(ae);
		assertNotNull(ae);
	}
	
	public final void supprimerAt_Enchere(At_Enchere ae) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		At_EnchereDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager créé");
	
		
		At_EnchereDao.supprimerAt_Enchere(ae);
		assertNotNull(ae);
		}

}
