package com.isamm.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Personne
 *
 */
@Entity

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
		public void setLogin(String login) {
			this.login = login;
		}
		public String getPwd() {
			return pwd;
		}
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
		
		
		

	}
