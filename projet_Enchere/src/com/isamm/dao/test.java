package com.isamm.dao;
import com.isamm.dao.impl.*;
import com.isamm.domain.*;

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
		System.out.println("apr�s l'ajout");
		
		
		Personne per=new Personne();
		per.setLogin("dali");
		per.setPwd("0000");
		per.setNom("dali");
		
		
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
