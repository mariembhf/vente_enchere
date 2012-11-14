package com.isamm.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(
		name="At_Enchere.findAt_EnchereByPrix_propose",
	    query="SELECT p FROM At_Enchere p WHERE p.prix_propose = :prix_propose"
		)
public class At_Enchere {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAt_Enchere;
	private int idVente_Enchere;
	private int idProduit;
	private int idEnchereur;
	private int prix_propose;
	private Date date;

	
	public At_Enchere() {
		// TODO Auto-generated constructor stub
	}


	public int getIdAt_Enchere() {
		return idAt_Enchere;
	}


	public void setIdAt_Enchere(int idAt_Enchere) {
		this.idAt_Enchere = idAt_Enchere;
	}

	
	

	public int getIdVente_Enchere() {
		return idVente_Enchere;
	}


	public void setIdVente_Enchere(int idVente_Enchere) {
		this.idVente_Enchere = idVente_Enchere;
	}


	public int getPrix_propose() {
		return prix_propose;
	}


	public void setPrix_propose(int prix_propose) {
		this.prix_propose = prix_propose;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public int getIdProduit() {
		return idProduit;
	}


	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}


	public int getIdEnchereur() {
		return idEnchereur;
	}


	public void setIdEnchereur(int idEnchereur) {
		this.idEnchereur = idEnchereur;
	}
	
	
	

}
