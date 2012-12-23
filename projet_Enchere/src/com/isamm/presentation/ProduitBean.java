package com.isamm.presentation;

import java.io.Serializable;
import java.util.ArrayList;
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
	
	private List<String> libelleProduits;

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
	
	
	public  List<String> getLibelleProduits() {
		return libelleProduits;
	}

	public  void setLibelleProduits(List<String> libelleProduits) {
		this.libelleProduits = libelleProduits;
	}

	public ProduitBean() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	public String listProduitEncher()
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
		
		return null;
		
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
		libelleProduits=new ArrayList<String>();
		System.out.println("taille de la liste est "+libelleProduits.size());
		
		while(it.hasNext())
		{
			Produit p=(Produit)it.next();
			System.out.println("id = "+p.getIdProduit());
			System.out.println(" description = "+p.getDescription());
			
			//this.getLibelleProduits().add(p.getLibelle());
			libelleProduits.add(p.getLibelle());
			System.out.println("taille de la liste est "+libelleProduits.size());
			
		}
		
		//vider la liste des libelle des anciennes valeurs
		/*if(libelleProduits.isEmpty()){
			 libelleProduits.clear();
			}*/
		
		 /*libelleProduits=new ArrayList<String>();
		
		//remplissage de la liste des libelles avec des nouvelles valeurs
		 for(int i=0;i<this.listProduits.size();i++){
			 this.getLibelleProduits().add(this.listProduits.get(i).getLibelle());
			   
	    	   //System.out.println(this.listProduits.get(i).toString());  
	    	  
	    	}*/
		
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
