package com.isamm.presentation;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.isamm.dao.impl.ProduitDaoImpl;
import com.isamm.dao.impl.VenteEnchereDaoImpl;
import com.isamm.domain.Personne;
import com.isamm.domain.Produit;
import com.isamm.domain.VenteEnchere;


@ManagedBean(name="historique")
@SessionScoped
public class HistoriqueBean {
	
	

	private List<Historique> listHistorique;

	public List<Historique> getListHistorique() {
		return listHistorique;
	}

	public void setListHistorique(List<Historique> listHistorique) {
		this.listHistorique = listHistorique;
	}

	
	public String historiqueVente()
	{
		
		this.listHistorique = new ArrayList();
		//recupération des ventesencheres effectuer par le vendeur
		VenteEnchereDaoImpl vdi=new VenteEnchereDaoImpl();
		ProduitDaoImpl pdi=new ProduitDaoImpl();
		int idProd=0;
		Produit prod;
		Historique hist = new Historique();
		List<VenteEnchere> listVE=vdi.trouverVEValide();
		System.out.println("longueur de la liste des ventes encheres "+listVE.size());
		if(!listVE.isEmpty())
		{
			System.out.println("dans historique vente");
			Iterator it=listVE.iterator();
			while(it.hasNext())
			{
				VenteEnchere ve=(VenteEnchere)it.next();
				if(ve.getIdPersonne()==Personne.idSession)
				{
					idProd=ve.getIdProduit();
					System.out.println("id du produit "+idProd);
					prod=pdi.getProduit(idProd);
					System.out.println("libelle de produit "+prod.getLibelle());
					hist.setNomProd(prod.getLibelle());
					System.out.println("libelle de l'historique "+hist.getNomProd());
					hist.setDescProd(prod.getDescription());
					hist.setDate(ve.getDate_fin());
					try
					{
						this.listHistorique.add(hist);
					}
					catch(Exception e)
					{
						System.out.println(e.toString());
					}
					
				}
				
			}
			
			
		}
		
		
		System.out.println("longueur de la liste "+this.listHistorique.size());
		
		return null;
	}
	
	
	public String historiqueAchat()
	{
		return null;
	}
	
	
}
