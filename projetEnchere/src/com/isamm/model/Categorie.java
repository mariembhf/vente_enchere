package com.isamm.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Categorie
 *
 */
@Entity

public class Categorie implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCategorie;
	private String libelleCategorie;
	
	
	public Categorie() {
		// TODO Auto-generated constructor stub
	}


	public int getIdCategorie() {
		return idCategorie;
	}


	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}


	public String getLibelleCategorie() {
		return libelleCategorie;
	}


	public void setLibelleCategorie(String libelleCategorie) {
		this.libelleCategorie = libelleCategorie;
	}
	
}
