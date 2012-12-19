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
	private Produit selectedProduit;
	
	private String libelle;
	private String dernierPrix;
	

	public List<Produit> getListProduits() {
		return listProduits;
	}

	public void setListProduits(List<Produit> listProduits) {
		this.listProduits = listProduits;
	}
	
	
	public Produit getSelectedProduit() {
		return selectedProduit;
	}

	public void setSelectedProduit(Produit selectedProduit) {
		this.selectedProduit = selectedProduit;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDernierPrix() {
		return dernierPrix;
	}

	public void setDernierPrix(String dernierPrix) {
		this.dernierPrix = dernierPrix;
	}

	public ProduitBean() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	public void listProduitDispo()
	{
		ProduitDaoImpl pdi=new ProduitDaoImpl();
		
		this.listProduits=pdi.listProduitEncher();
		
		Iterator it=listProduits.iterator();
		
		while(it.hasNext())
		{
			Produit p=(Produit)it.next();
			System.out.println("id = "+p.getIdProduit());
			System.out.println(" description = "+p.getDescription());
		}
		
		
		
	}
	
	
	public void detailProd(Produit prod)
	{
		System.out.println("en cours du changement du libelle");
		System.out.println(prod.getLibelle());
		this.libelle = prod.getLibelle();
		System.out.println(this.getLibelle());
		
	}
	
	
	public void afficher()
	{
		
		this.libelle = "produit2";
		System.out.println(this.getLibelle());
		
	}
	
	
	public void listProduitNonEncher()
	{
		ProduitDaoImpl pdi=new ProduitDaoImpl();
		
		this.listProduits=pdi.listProduitNonEncher(Personne.idSession);
		
		Iterator it=listProduits.iterator();
		
		while(it.hasNext())
		{
			Produit p=(Produit)it.next();
			System.out.println("id = "+p.getIdProduit());
			System.out.println(" description = "+p.getDescription());
		}
		
	}
	
	
	public String editAction(Produit produit) {
	    
		produit.setEditable(true);
		return null;
	}

	
	public void modifierProd()
	{
		
		ProduitDaoImpl pdi = new ProduitDaoImpl();
		
		for (Produit produit : this.listProduits){
			
			System.out.println("Dans la méthode de modification");
			if(produit.isEditable()==true)
			{
				produit.setEditable(false);
				pdi.modifierProduit(produit);
			}
		
		
		
		}

	}
	
	
}
