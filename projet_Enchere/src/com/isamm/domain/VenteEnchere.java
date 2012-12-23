package com.isamm.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.*;

import org.springframework.beans.factory.annotation.Required;

import com.isamm.dao.impl.ProduitDaoImpl;
import com.isamm.dao.impl.VenteEnchereDaoImpl;

/**
 * Entity implementation class for Entity: Vente_Enchere
 *
 */
@Entity

@ManagedBean(name="venteenchere")
@SessionScoped
public class VenteEnchere implements Serializable {

	
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
	private String etatVente;
	private int quantite;

	public VenteEnchere() {
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
	@Required
	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public int getIdPersonne() {
		return idPersonne;
	}
	@Required
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
	@Required
	public void setPrix_initial(int prix_initial) {
		this.prix_initial = prix_initial;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	
	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	
	public String getEtatVente() {
		return etatVente;
	}

	public void setEtatVente(String etatVente) {
		this.etatVente = etatVente;
	}

	public void ajouterVenteEnchere(String libelleProduit)
	{
		//recuperation de l'id du produit a encherir
		ProduitDaoImpl pdi=new ProduitDaoImpl();
		Iterator it= pdi.trouverProduit(libelleProduit).iterator();
		Produit p = (Produit) it.next();
		int idProd =p.getIdProduit();
		
		
		//remplissage de la vente enchere
		VenteEnchere ve= new VenteEnchere();
		ve.setIdPersonne(Personne.idSession);
		ve.setIdProduit(idProd);
		ve.setDate_deb(this.getDate_deb());
		ve.setDate_fin(this.getDate_fin());
		ve.setPrix_initial(this.getPrix_initial());
		ve.setEtat("encour");
		ve.setQuantite(this.getQuantite());
		ve.setEtatVente("nonvalide");
		
		//ajout dans la base
		VenteEnchereDaoImpl vdi=new VenteEnchereDaoImpl();
		vdi.insererVente_Enchere(ve);
		
		//modifier l'etat du produit
		p.setEtat("encher");
		pdi.modifierProduit(p);
	}
	
	public List <VenteEnchere> trouverVE( int idProduit)
	{
		VenteEnchereDaoImpl vdi=new VenteEnchereDaoImpl();
		List <VenteEnchere> p=vdi.trouverVE(idProduit);
		
		return p;
		
	}
	
	
   
}
