package com.isamm.model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import javax.persistence.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

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
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int idPersonne;
		private String nom;
		private String login;
		private String pwd;
		private String mail;
		private String adresse;
		
		
		
		
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
			
			boolean trouve=false;
				PersonneDaoImpl pdi=new PersonneDaoImpl();
				List <Personne> listpersonne = pdi.trouverPersonne(p);
				Iterator it=listpersonne.iterator();
				while(it.hasNext())
				{
					Personne per=(Personne)it.next();
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
