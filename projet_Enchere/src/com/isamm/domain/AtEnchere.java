package com.isamm.domain;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.*;

import org.springframework.beans.factory.annotation.Required;

/**
 * Entity implementation class for Entity: At_Enchere
 *
 */
@Entity

@ManagedBean(name="atenchere")
@SessionScoped

public class AtEnchere implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAtEnchere;
	private int idVenteEnchere;
	private int idProduit;
	private int idEnchereur;
	private int prix_propose;
	@Temporal(TemporalType.DATE) private Date date;
	

	
	public AtEnchere() {
		// TODO Auto-generated constructor stub
	}


	public int getIdAt_Enchere() {
		return idAtEnchere;
	}


	public void setIdAt_Enchere(int idAt_Enchere) {
		this.idAtEnchere = idAt_Enchere;
	}

	
	

	public int getIdVente_Enchere() {
		return idVenteEnchere;
	}

	@Required
	public void setIdVente_Enchere(int idVente_Enchere) {
		this.idVenteEnchere = idVente_Enchere;
	}


	public int getPrix_propose() {
		return prix_propose;
	}

	@Required
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

	@Required
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
