package com.isamm.dao;

import javax.persistence.EntityManager;
import com.isamm.dao.*;
import com.isamm.model.Produit;


public class ProduitDao {

	public static EntityManager em;
	public static void insererProduit(Produit p){
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
	}

}
