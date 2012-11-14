package com.isamm.model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity
@NamedQuery(
		name="Vendeur.findVendeurByNom",
	    query="SELECT p FROM Vendeur p WHERE p.nom = :nom"
		)
public class Vendeur extends Personne{
	
	private int code_tva;
	
	@OneToMany(cascade=CascadeType.MERGE)
	private List<Produit> listeProduits;

	public Vendeur() {
		// TODO Auto-generated constructor stub
	}

	public int getCode_tva() {
		return code_tva;
	}

	public void setCode_tva(int code_tva) {
		this.code_tva = code_tva;
	}

	public List<Produit> getListeProduits() {
		return listeProduits;
	}

	public void setListeProduits(List<Produit> listeProduits) {
		this.listeProduits = listeProduits;
	}

	
	
	
}
