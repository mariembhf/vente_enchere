package com.isamm.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.*;

import org.springframework.beans.factory.annotation.Required;

import com.isamm.dao.impl.AtEnchereDaoImpl;
import com.isamm.dao.impl.VenteEnchereDaoImpl;

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
	private String nomEnchereur;
	private int idEnchereur;
	private int prix_propose;
	@Temporal(TemporalType.DATE) private Date date;
	private String etat;
	private int quantite;
	

	
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
	
	
	
	public String getNomEnchereur() {
		return nomEnchereur;
	}


	public void setNomEnchereur(String nomEnchereur) {
		this.nomEnchereur = nomEnchereur;
	}


	public int getIdAtEnchere() {
		return idAtEnchere;
	}


	public void setIdAtEnchere(int idAtEnchere) {
		this.idAtEnchere = idAtEnchere;
	}


	public int getIdVenteEnchere() {
		return idVenteEnchere;
	}


	public void setIdVenteEnchere(int idVenteEnchere) {
		this.idVenteEnchere = idVenteEnchere;
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


	public String detailAtEnchere(Produit p)
	{
		VenteEnchereDaoImpl vdi= new VenteEnchereDaoImpl();
		List <VenteEnchere> listVente = vdi.trouverVE(p.getIdProduit());
		Iterator it= listVente.iterator();
		VenteEnchere ve=(VenteEnchere) it.next();
		
		System.out.println("dans atenchere idproduit est "+p.getIdProduit());
		System.out.println("dans atenchere idventeenchere est "+ve.getIdVente_Enchere());
		
		//trouver le atenchere qui correspond au produit et au vente enchere
		AtEnchereDaoImpl adi = new AtEnchereDaoImpl();
		List <AtEnchere> listEnchere= adi.trouverAtEnchere(p.getIdProduit(), ve.getIdVente_Enchere());
		
		if(listEnchere.isEmpty()==false)
		{
			Iterator it1= listEnchere.iterator();
			AtEnchere ae= (AtEnchere)it1.next();
			
			//initialisation de l'atenchere
			this.setQuantite(ve.getQuantite());
			this.setPrix_propose(ae.getPrix_propose());
		}
		else
		{
			System.out.println("la liste est vide");
		}
		
		
		return null;
	}
	
	public String detailVenteEnchere(VenteEnchere ve)
	{
		//trouver le atenchere correspondant à cette venteenchere et à ce produit
		AtEnchereDaoImpl adi=new AtEnchereDaoImpl();
		List <AtEnchere> listEnchere=adi.trouverAtEnchere(ve.getIdProduit(), ve.getIdVente_Enchere());
		
		if(listEnchere.isEmpty()==false)
		{
			Iterator it1= listEnchere.iterator();
			AtEnchere ae= (AtEnchere)it1.next();
			
			//initialisation de l'atenchere
			this.setQuantite(ve.getQuantite());
			this.setPrix_propose(ae.getPrix_propose());
			this.setNomEnchereur(ae.getNomEnchereur());
		}
		else
		{
			System.out.println("la liste est vide");
		}
		
		
		return null;
	}
   
}
