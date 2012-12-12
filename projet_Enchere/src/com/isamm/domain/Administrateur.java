package com.isamm.domain;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.*;

import com.isamm.dao.impl.*;

/**
 * Entity implementation class for Entity: Administrateur
 *
 */
@Entity

@ManagedBean(name="admin")
@SessionScoped

public class Administrateur extends Personne implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Administrateur() {
		super();
	}
	
	
	public String inscrir()
	{
		Administrateur p=new Administrateur();
		p.setLogin(this.getLogin());
		p.setPwd(this.getPwd());
		p.setNom(this.getNom());
		p.setAdresse(this.getAdresse());
		p.setMail(this.getMail());
		
		try
		{
			AdministrateurDaoImpl pdi=new AdministrateurDaoImpl();
			pdi.insererAdministrateur(p);
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
		Administrateur p=new Administrateur();
		p.setLogin(this.getLogin());
		p.setPwd(this.getPwd());
		
		boolean trouve=false;
		AdministrateurDaoImpl pdi=new AdministrateurDaoImpl();
			List <Administrateur> listpersonne = pdi.trouverAdministrateur(p);
			Iterator it=listpersonne.iterator();
			while(it.hasNext())
			{
				Administrateur per=(Administrateur)it.next();
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
