package com.isamm.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(
		name="Produit.findProduitByLibelle",
	    query="SELECT p FROM Produit p WHERE p.libelle = :libelle"
		)
public class Produit {
	
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



	public void setQuantite_stock(int quantite_stock) {
		this.quantite_stock = quantite_stock;
	}
	
	

}
