package com.isamm.domain;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import javax.persistence.*;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Required;

import com.isamm.dao.PersonneDao;
import com.isamm.dao.impl.PersonneDaoImpl;


/**
 * Entity implementation class for Entity: Personne
 *
 */
@Entity




@ManagedBean(name="personne")
@SessionScoped

@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Personne implements Serializable {

	private static final long serialVersionUID = 1L;
	public static int idSession = 1;
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int idPersonne;
		private String nom;
		private String login;
		private String pwd;
		private String mail;
		private String adresse;
		
		
		private int code_tva;
		
		@OneToMany(cascade=CascadeType.MERGE)
		private List<Produit> listeProduits;
		
		public Personne() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		public int getIdPersonne() {
			return idPersonne;
		}
		public void setIdPersonne(int idPersonne) {
			this.idPersonne = idPersonne;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getLogin() {
			return login;
		}
		@Required
		public void setLogin(String login) {
			this.login = login;
		}
		public String getPwd() {
			return pwd;
		}
		@Required
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		public String getMail() {
			return mail;
		}
		public void setMail(String mail) {
			this.mail = mail;
		}
		public String getAdresse() {
			return adresse;
		}
		public void setAdresse(String adresse) {
			this.adresse = adresse;
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



		public void setListeProduits(List<Produit> listeProduits) {
			this.listeProduits = listeProduits;
		}



		public String inscrir()
		{
			Personne p=new Personne();
			p.setLogin(this.getLogin());
			p.setPwd(this.getPwd());
			p.setNom(this.getNom());
			p.setAdresse(this.getAdresse());
			p.setMail(this.getMail());
			
			try
			{
				PersonneDaoImpl pdi=new PersonneDaoImpl();
				pdi.insererPersonne(p);
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
			Personne p=new Personne();
			p.setLogin(this.getLogin());
			p.setPwd(this.getPwd());
			
			FacesContext contextF = FacesContext.getCurrentInstance();
			
			boolean trouve=false;
				PersonneDaoImpl pdi=new PersonneDaoImpl();
				List <Personne> listpersonne = pdi.trouverPersonne(p);
				Iterator it=listpersonne.iterator();
				while(it.hasNext())
				{
					Personne per=(Personne)it.next();
					if((per.getLogin().equals(this.getLogin()))&&(per.getPwd().equals(this.getPwd())))
					{
						System.out.println("Personne trouvée");
						trouve=true;
						Personne.idSession=per.getIdPersonne();
					}
					else
					{
						System.out.println("Personne non trouvée");
						contextF.addMessage("auth:username", new FacesMessage(
								"login ou mot de passe invalide !!!"));
						
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
		
		public void ajouterProduitAVendeur(Produit produit)
		{
			PersonneDaoImpl vdi=new PersonneDaoImpl();
			produit.setEtat("nonencher");
			vdi.ajouterProduitAVendeur(Personne.idSession, produit);
		}

	}
