package com.isamm.dao.impl;



import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.isamm.dao.*;
import com.isamm.dao.*;
import com.isamm.domain.*;

public class VenteEnchereDaoImpl {
	
	
	public final void insererVente_Enchere(VenteEnchere ve) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		VenteEnchereDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager créé");
		
		
		VenteEnchereDao.insererVente_Enchere(ve);
		
	}


	public final void modifierVente_Enchere(VenteEnchere ve) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		VenteEnchereDao.em  = emf.createEntityManager();
	
		System.out.println("entity manager créé");
	
	
		VenteEnchereDao.modifierVente_Enchere(ve);
		
	}
	
	public final void supprimerVente_Enchere(VenteEnchere ve) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		VenteEnchereDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager créé");
	
		
		VenteEnchereDao.supprimerVente_Enchere(ve);
		
		}

	public final List <VenteEnchere> trouverVE(int idProd)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		VenteEnchereDao.em  = emf.createEntityManager();
		
		
	
		
		return VenteEnchereDao.trouverVE(idProd);
	}

}
