package com.isamm.domain;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.*;

import org.springframework.beans.factory.annotation.Required;

/**
 * Entity implementation class for Entity: Produit
 *
 */
@Entity


@ManagedBean(name="prod")
@SessionScoped

public class Produit implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idProduit;
	private String libelle;
	private String description;
	private int quantite_stock;
	
	

	public Produit() {
		// TODO Auto-generated constructor stub
	}



	public int getIdProduit() {
		return idProduit;
	}



	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}



	public String getLibelle() {
		return libelle;
	}



	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getQuantite_stock() {
		return quantite_stock;
	}


	@Required
	public void setQuantite_stock(int quantite_stock) {
		this.quantite_stock = quantite_stock;
	}
	

	public void encherir()
	{
		
			System.out.println(" dans méthode encherir");
		
		
	}
   
}
