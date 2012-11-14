package com.isamm.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


@Entity
@NamedQuery(
		name="Categorie.findCategorieByLibelleCategorie",
	    query="SELECT c FROM Categorie p WHERE p.libelleCategorie = :libelleCategorie"
		)
public class Categorie {

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
