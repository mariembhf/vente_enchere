package com.isamm.dao.impl;



import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.isamm.dao.*;
import com.isamm.dao.*;
import com.isamm.model.*;

public class Vente_EnchereDaoImpl {
	
	
	public final void insererVente_Enchere(Vente_Enchere ve) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		Vente_EnchereDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager cr��");
		
		
		Vente_EnchereDao.insererVente_Enchere(ve);
		
	}


	public final void modifierVente_Enchere(Vente_Enchere ve) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		Vente_EnchereDao.em  = emf.createEntityManager();
	
		System.out.println("entity manager cr��");
	
	
		Vente_EnchereDao.modifierVente_Enchere(ve);
		
	}
	
	public final void supprimerVente_Enchere(Vente_Enchere ve) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		Vente_EnchereDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager cr��");
	
		
		Vente_EnchereDao.supprimerVente_Enchere(ve);
		
		}


}
