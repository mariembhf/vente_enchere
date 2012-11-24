package com.isamm.dao;
import com.isamm.model.*;
import com.isamm.dao.impl.*;

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
		
		
		Personne per=new Personne();
		per.setLogin("mar");
		per.setPwd("0000");
		per.setNom("mariem");
		
		
		try
		{
			PersonneDaoImpl perdi=new PersonneDaoImpl();
			perdi.insererPersonne(per);
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		
	}

}
