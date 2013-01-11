package com.isamm.presentation;

import java.awt.Image;
import java.util.ArrayList;  
import java.util.Collection;
import java.util.Iterator;
import java.util.List;  
import java.util.ListIterator;
 

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="galleriaBean")
@SessionScoped

public class GalleriaBean {
	  
	 private List<String> images;  
	  
	    private List<Player> players;  
	  
	    private Player selectedPlayer;  
	  
	    @PostConstruct  
	    public void init() {  
	        images = new ArrayList<String>();  
	  
	        for(int i=1;i<=12;i++) {  
	            images.add("galleria" + i + ".jpg");  
	        }  
	  
	        players = new ArrayList<Player>();  
	  
	        players.add(new Player("Messi", 10, "messi.jpg", "CF"));  
	        players.add(new Player("Iniesta", 8, "iniesta.jpg", "CM"));  
	        players.add(new Player("Villa", 7, "villa.jpg", "CF"));  
	        players.add(new Player("Xavi", 6, "xavi.jpg", "CM"));  
	        players.add(new Player("Puyol", 5, "puyol.jpg", "CB"));  
	    }  
	  
	    public Player getSelectedPlayer() {  
	        return selectedPlayer;  
	    }  
	  
	    public void setSelectedPlayer(Player selectedPlayer) {  
	        this.selectedPlayer = selectedPlayer;  
	    }  
	  
	     
	    public List<String> getImages() {  
	        return images;  
	    }  
	  
	    public List<Player> getPlayers() {  
	        return players;  
	    }  
} 
	
	

