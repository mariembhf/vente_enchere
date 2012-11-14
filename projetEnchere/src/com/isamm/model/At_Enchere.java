package com.isamm.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: At_Enchere
 *
 */
@Entity

public class At_Enchere implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAt_Enchere;
	private int idVente_Enchere;
	private int idProduit;
	private int idEnchereur;
	private int prix_propose;
	@Temporal(TemporalType.DATE) private Date date;
	

	
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
