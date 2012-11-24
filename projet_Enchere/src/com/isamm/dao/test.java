package com.isamm.dao;
import com.isamm.model.*;
import com.isamm.dao.impl.ProduitDaoImpl;

public class test {
	
	
	public static void main (String args[])
	{
		System.out.println("avant l'ajout");
		ProduitDaoImpl pdi = new ProduitDaoImpl();
		
		Produit p =new Produit();
		p.setDescription("description produit 2");
		p.setLibelle("produit2");
		p.setQuantite_stock(5);
		pdi.insererProduit(p);
		System.out.println("après l'ajout");
	}

}
