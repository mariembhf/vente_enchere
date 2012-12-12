package com.isamm.domain;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.*;

import com.isamm.dao.impl.*;

/**
 * Entity implementation class for Entity: Enchereur
 *
 */
@Entity

@ManagedBean(name="enchereur")
@SessionScoped

public class Enchereur  extends Personne implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Enchereur() {
		super();
	}
   
	
	public String inscrir()
	{
		Enchereur p=new Enchereur();
		p.setLogin(this.getLogin());
		p.setPwd(this.getPwd());
		p.setNom(this.getNom());
		p.setAdresse(this.getAdresse());
		p.setMail(this.getMail());
		
		try
		{
			EnchereurDaoImpl pdi=new EnchereurDaoImpl();
			pdi.insererEnchereur(p);
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
		Enchereur p=new Enchereur();
		p.setLogin(this.getLogin());
		p.setPwd(this.getPwd());
		
		boolean trouve=false;
		EnchereurDaoImpl pdi=new EnchereurDaoImpl();
			List <Enchereur> listpersonne = pdi.trouverEnchereur(p);
			Iterator it=listpersonne.iterator();
			while(it.hasNext())
			{
				Enchereur per=(Enchereur)it.next();
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
