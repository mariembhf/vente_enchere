package com.isamm.model;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;


@Entity
@NamedQuery(
		name="Administrateur.findAdministrateurByNom",
	    query="SELECT p FROM Administrateur p WHERE p.nom = :nom"
		)
public class Administrateur extends Personne {

	public Administrateur() {
		// TODO Auto-generated constructor stub
	}

}
