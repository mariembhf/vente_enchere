package com.isamm.presentation;


import java.io.Serializable;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.isamm.domain.*;

@ManagedBean(name="redirection")
@SessionScoped

public class Redirection implements Serializable
{
private String includedPage = "/start.xhtml";

public String sideBarAction()
{
	System.out.println("fonction ");
/**
* Get the request parameter map from the context, so that we can find which link of the side is clicked
*/
FacesContext context = FacesContext.getCurrentInstance();
String selectedPageViewId =context.getExternalContext().getRequestParameterMap().get("pageViewId");

if (selectedPageViewId.equalsIgnoreCase("Acheter"))
{
includedPage = "/Acheter.xhtml";
}
else if (selectedPageViewId.equalsIgnoreCase("Vendre"))
{
includedPage = "/AjoutEnchere.xhtml";
}
else if (selectedPageViewId.equalsIgnoreCase("Compte"))
{
includedPage = "/Authentification.xhtml";
}
else if (selectedPageViewId.equalsIgnoreCase("Aide"))
{
includedPage = "/Aide.xhtml";
}
else if (selectedPageViewId.equalsIgnoreCase("Rechercher"))
{
includedPage = "/Rechercher.xhtml";
}
else if (selectedPageViewId.equalsIgnoreCase("AjoutProd"))
{
includedPage = "/AjouterProduit.xhtml";
}
else if (selectedPageViewId.equalsIgnoreCase("MAJProd"))
{
includedPage = "/majProduit.xhtml";
}
else if (selectedPageViewId.equalsIgnoreCase("Historique"))
{
includedPage = "/Historique.xhtml";
}
else if (selectedPageViewId.equalsIgnoreCase("validation"))
{
includedPage = "/ValiderAchat.xhtml";
}


System.out.println("Page Id is: " + selectedPageViewId);
return "includedPage";
}

/**
* @return the includedPage
*/
public String getIncludedPage()
{
return includedPage;
}

/**
* @param includedPage the includedPage to set
*/
public void setIncludedPage(String includedPage)
{
this.includedPage = includedPage;
}

public String getOnclickFunction() {
    return "#{redirection.includedPage}" ;
}


//methode pour la connexion d'un utilisateur
public String seconnecter(Personne p) {
	
	FacesContext context = FacesContext.getCurrentInstance();
	String selectedPageViewId =context.getExternalContext().getRequestParameterMap().get("pageViewId");
	
	System.out.println("login = "+p.getLogin().toString());
	System.out.println("mot de passe = "+p.getPwd().toString());
	String res = p.seconnecter();
	System.out.println("au début de se connecter ");
	
	if(res.equals("success"))
	{
		  //this.setIncludedPage("/Accueil_secondaire.xhtml");
		  //this.includedPage="/Bienvenue.xhtml" ;
		  System.out.println("set include à bienvenue");
		  System.out.println(this.includedPage.toString());
	}
	else
	{
		  //this.setIncludedPage("/Authentification.xhtml") ;
		  System.out.println("set include à authentification ");
		  System.out.println(this.includedPage.toString());
		  
		  
		  context.addMessage("auth:userlogin", new FacesMessage("Login ou mot de passe incorrect !!"));
		  
		  
	}
	
	return this.includedPage;
   
}





}
