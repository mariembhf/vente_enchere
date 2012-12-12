package com.isamm.presentation;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.isamm.dao.impl.ProduitDaoImpl;
import com.isamm.domain.*;

@ManagedBean(name="produit")
@SessionScoped
public class ProduitBean implements Serializable {
	
	
	private List<Produit> listProduits;

	public List<Produit> getListProduits() {
		return listProduits;
	}

	public void setListProduits(List<Produit> listProduits) {
		this.listProduits = listProduits;
	}

	public ProduitBean() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	public void listProduitDispo()
	{
		ProduitDaoImpl pdi=new ProduitDaoImpl();
		
		this.listProduits=pdi.listProduit();
		
		Iterator it=listProduits.iterator();
		
		while(it.hasNext())
		{
			Produit p=(Produit)it.next();
			System.out.println("id = "+p.getIdProduit());
			System.out.println(" description = "+p.getDescription());
		}
		
		
		
	}
	
	
	
	

}
