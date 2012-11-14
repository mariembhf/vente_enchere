package com.isamm.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Vente_Enchere
 *
 */
@Entity

public class Vente_Enchere implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idVente_Enchere;
	private int idProduit;
	private int idPersonne;
	@Temporal(TemporalType.DATE) private Date date_deb;
	@Temporal(TemporalType.DATE) private Date date_fin;
	private int prix_initial;
	private String etat;

	public Vente_Enchere() {
		// TODO Auto-generated constructor stub
	}

	public int getIdVente_Enchere() {
		return idVente_Enchere;
	}

	public void setIdVente_Enchere(int idVente_Enchere) {
		this.idVente_Enchere = idVente_Enchere;
	}

	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public int getIdPersonne() {
		return idPersonne;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	public Date getDate_deb() {
		return date_deb;
	}

	public void setDate_deb(Date date_deb) {
		this.date_deb = date_deb;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	public int getPrix_initial() {
		return prix_initial;
	}

	public void setPrix_initial(int prix_initial) {
		this.prix_initial = prix_initial;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}
   
}
