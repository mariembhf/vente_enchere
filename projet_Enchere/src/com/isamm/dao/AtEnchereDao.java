package com.isamm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.isamm.domain.*;

public class AtEnchereDao {
	
	public static EntityManager em;
	
	public static void insererAt_Enchere(AtEnchere ae){
		
		em.getTransaction().begin();
		em.persist(ae);
		em.getTransaction().commit();
		
	}
	
	public static void modifierAt_Enchere(AtEnchere ae){
		
		try{
		    em.getTransaction().begin();
		    AtEnchere ate = em.find(AtEnchere.class, ae.getIdAt_Enchere());
		    ate.setIdEnchereur(ae.getIdEnchereur());
		    ate.setIdProduit(ae.getIdProduit());
		    ate.setPrix_propose(ae.getPrix_propose());
		    ate.setDate(ae.getDate());
		    em.getTransaction().commit();
		    
		  }
		finally 
		{
		    em.close();
		    
		}
		
	}
	
	
	public static void supprimerAt_Enchere(AtEnchere ae){
		
		try{
		    em.getTransaction().begin();
		    em.remove(ae);
		    em.getTransaction().commit();
		  }
		finally 
		{
		    em.close();
		    
		}
		
	}

	public static List<AtEnchere> trouverAtEnchere(int idProduit,int idVenteEnchere)
	{
		System.out.println("l'id du produit est "+idProduit);
		System.out.println("l'id de la vente enchere est "+idVenteEnchere);
		
		Query query = em.createNativeQuery("select * from AtEnchere ae where ae.idProduit="+idProduit+" and ae.idVenteEnchere="+idVenteEnchere+"",AtEnchere.class);
		List <AtEnchere> p = query.getResultList();
		return p;
	}
	

}
