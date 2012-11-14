package com.isamm.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Vendeur
 *
 */
@Entity

public class Vendeur extends Personne implements Serializable {

	
	private static final long serialVersionUID = 1L;

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
