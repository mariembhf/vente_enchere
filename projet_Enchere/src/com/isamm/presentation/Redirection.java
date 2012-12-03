package com.isamm.presentation;


import java.io.Serializable;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

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
includedPage = "/Vendre.xhtml";
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
}
