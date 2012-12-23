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
import com.isamm.dao.impl.PersonneDaoImpl;
import com.isamm.dao.impl.ProduitDaoImpl;
import com.isamm.dao.impl.VenteEnchereDaoImpl;
import com.isamm.presentation.VenteEnchereBean;

/**
 * Entity implementation class for Entity: Produit
 *
 */
@Entity


@ManagedBean(name="prod")
@SessionScoped

public class Produit implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idProduit;
	private String libelle;
	private String description;
	private int quantite_stock;
	private String etat;
	

	private boolean editable;
	

	public Produit() {
		// TODO Auto-generated constructor stub
	}



	public int getIdProduit() {
		return idProduit;
	}



	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}



	public String getLibelle() {
		return libelle;
	}



	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getQuantite_stock() {
		return quantite_stock;
	}


	@Required
	public void setQuantite_stock(int quantite_stock) {
		this.quantite_stock = quantite_stock;
	}
	
	

	public String getEtat() {
		return etat;
	}



	public void setEtat(String etat) {
		this.etat = etat;
	}


	

	public boolean isEditable() {
		return editable;
	}



	public void setEditable(boolean editable) {
		this.editable = editable;
	}



	public String encherir(String libProd,int prixPropose)
	{
		System.out.println(" dans méthode encherir");
		System.out.println(" le libelle du produit est "+libProd);
		System.out.println(" le prix proposé est "+prixPropose);
		
		//recuperation de l'id du produit a encherir
		ProduitDaoImpl pdi=new ProduitDaoImpl();
		Iterator it= pdi.trouverProduit(libProd).iterator();
		Produit p = (Produit) it.next();
		int idProd =p.getIdProduit();
		
		//chercher le venteencher correspondante
		VenteEnchereDaoImpl vdi = new VenteEnchereDaoImpl();
		Iterator it1=vdi.trouverVE(idProd).iterator();
		VenteEnchere ve=(VenteEnchere) it1.next();
		int idVE = ve.getIdVente_Enchere();
		
		//trouver le nom de l'enchereur
		PersonneDaoImpl personneDI=new PersonneDaoImpl();
		
		
		//enregistrer la demande dans l'atenchere
		AtEnchere ate= new AtEnchere();
		ate.setIdProduit(idProd);
		ate.setIdVente_Enchere(idVE);
		ate.setIdEnchereur(Personne.idSession);
		ate.setNomEnchereur(personneDI.trouverPersonneParId(Personne.idSession).getNom());
		ate.setDate(new Date());//la date actuelle
		ate.setPrix_propose(prixPropose);
		ate.setEtat("encour");
		
		AtEnchereDaoImpl adi = new AtEnchereDaoImpl();
		adi.insererAt_Enchere(ate);
			
		return null;
		
	}
   
	public void detailProd(Produit prod)
	{
		System.out.println("en cours du changement du libelle");
		System.out.println(prod.getLibelle());
		this.libelle = prod.getLibelle();
		System.out.println(this.getLibelle());
		
		//recupération de la quantité a vendre de ce produit dans l'encher
		/*VenteEnchere ve= new VenteEnchere();
		List <VenteEnchere> listeVE = ve.trouverVE(prod.getIdProduit());
		Iterator it=listeVE.iterator();
		while(it.hasNext())
		{
			VenteEnchere venteE=(VenteEnchere)it;
			if(venteE.getEtat().equals("encour"))
			{
				VenteEnchereBean.quantiteAVendre=venteE.getQuantite();
			}
		}*/
		
		
		
	}
	
	/*public void ajouterProduit(Produit p)
	{
		ProduitDaoImpl pdi = new ProduitDaoImpl();
		p.setEtat("nonencher");
		pdi.insererProduit(p);
		
		//récupération de l'id du produit déjà ajouté
		List <Produit> list=pdi.trouverProduit(p.getLibelle());
		Iterator it= pdi.trouverProduit(p.getLibelle()).iterator();
		Produit p2 = (Produit) it.next();
		int idProd =p2.getIdProduit();
		 System.out.println("l'id du produit est "+idProd);
		 System.out.println("l'id de l'utilisateur est "+Personne.idSession);
		
		//insertion de l'id du produit et l'id du vendeur dans la table personne_produit
		Vendeur v =new Vendeur();
		v.ajouterProduit(Personne.idSession, idProd);
		
	}*/
	
	
	public void supprimerProduit(Produit p)
	{
		ProduitDaoImpl pdi = new ProduitDaoImpl();
		pdi.supprimerProduit(p);
	}
		
		
	
	
}
