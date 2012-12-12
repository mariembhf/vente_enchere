package com.isamm.domain;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.*;

import org.springframework.beans.factory.annotation.Required;

import com.isamm.dao.impl.*;

/**
 * Entity implementation class for Entity: Vendeur
 *
 */
@Entity

@ManagedBean(name="vendeur")
@SessionScoped

public class Vendeur extends Personne implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private int code_tva;
	
	@OneToMany(cascade=CascadeType.MERGE)
	private List<Produit> listeProduits;

	public Vendeur() {
		// TODO Auto-generated constructor stub
	}

	public int getCode_tva() {
		return code_tva;
	}

	public void setCode_tva(int code_tva) {
		this.code_tva = code_tva;
	}

	public List<Produit> getListeProduits() {
		return listeProduits;
	}
	@Required
	public void setListeProduits(List<Produit> listeProduits) {
		this.listeProduits = listeProduits;
	}
   
	
	public String inscrir()
	{
		Vendeur p=new Vendeur();
		p.setLogin(this.getLogin());
		p.setPwd(this.getPwd());
		p.setNom(this.getNom());
		p.setAdresse(this.getAdresse());
		p.setMail(this.getMail());
		
		try
		{
			VendeurDaoImpl pdi=new VendeurDaoImpl();
			pdi.insererVendeur(p);
			return "success";
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			return "failure";
		}
		
		
	}
	
	
	public String seconnecter()
	{
		Vendeur p=new Vendeur();
		p.setLogin(this.getLogin());
		p.setPwd(this.getPwd());
		
		boolean trouve=false;
		VendeurDaoImpl pdi=new VendeurDaoImpl();
			List <Vendeur> listpersonne = pdi.trouverVendeur(p);
			Iterator it=listpersonne.iterator();
			while(it.hasNext())
			{
				Vendeur per=(Vendeur)it.next();
				if((per.getLogin()==this.getLogin())&&(per.getPwd()==this.getPwd()))
				{
					System.out.println("Personne trouvée");
					trouve=true;
				}
				else
				{
					System.out.println("Personne non trouvée");
					
				}
			}
			
			if(trouve==true)
			{
				return "success";
			}
			else
			{
				return "failure";
			}
			
		
		
	}
	
}
