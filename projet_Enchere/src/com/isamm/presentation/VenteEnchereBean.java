package com.isamm.presentation;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;


import com.isamm.dao.impl.VenteEnchereDaoImpl;
import com.isamm.domain.*;

@ManagedBean(name="venteBean")
public class VenteEnchereBean {
	
	private List <VenteEnchere> listeVenteEnchere=new ArrayList<>();
	public static int quantiteAVendre=0;
	private VenteEnchere selectedVenteEnchere;

	public List<VenteEnchere> getListeVenteEnchere() {
		return listeVenteEnchere;
	}

	public void setListeVenteEnchere(List<VenteEnchere> listeVenteEnchere) {
		this.listeVenteEnchere = listeVenteEnchere;
	}

	public static int getQuantiteAVendre() {
		return quantiteAVendre;
	}

	public static void setQuantiteAVendre(int quantiteAVendre) {
		VenteEnchereBean.quantiteAVendre = quantiteAVendre;
	}
	
	
	
	public VenteEnchere getSelectedVenteEnchere() {
		return selectedVenteEnchere;
	}

	public void setSelectedVenteEnchere(VenteEnchere selectedVenteEnchere) {
		this.selectedVenteEnchere = selectedVenteEnchere;
	}

	public void listEnchereNonValide()
	{
		VenteEnchereDaoImpl vdi = new VenteEnchereDaoImpl();
		this.listeVenteEnchere = vdi.trouverVENonValide();
		
		
	}
	
	public String validerLesEncher()
	{
		VenteEnchereDaoImpl vdi = new VenteEnchereDaoImpl();
		Iterator it= vdi.trouverVENonFini().iterator();
		while(it.hasNext())
		{
			VenteEnchere ve=(VenteEnchere)it.next();
			if((ve.getDate_fin().before(new Date())) && (ve.getEtat().equals("encour"))&& (ve.getEtatVente().equals("nonvalide")))
			{
				ve.setEtat("fini");
				vdi.modifierVente_Enchere(ve);
			}
		}
		
		//appel de la methode pour charger les listes des encheres non valide
		listEnchereNonValide();
		return null;
	}
	
	
	
	public String validerEnchere()
	{
		listEnchereNonValide();
		System.out.println("taille de la liste "+this.listeVenteEnchere.size());
		for (VenteEnchere ve : this.listeVenteEnchere){
			
			System.out.println("Dans la m�thode de validation");
			
			ve.setEtatVente("valide");
			
			VenteEnchereDaoImpl vdi = new VenteEnchereDaoImpl();
			vdi.modifierVente_Enchere(ve);
		
		
		}
		
		
		return null;
	}
	
}
