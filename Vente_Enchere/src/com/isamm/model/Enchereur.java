package com.isamm.model;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;


@Entity
@NamedQuery(
		name="Enchereur.findEnchereurByNom",
	    query="SELECT p FROM Enchereur p WHERE p.nom = :nom"
		)
public class Enchereur  extends Personne{

	public Enchereur() {
		// TODO Auto-generated constructor stub
	}

}
