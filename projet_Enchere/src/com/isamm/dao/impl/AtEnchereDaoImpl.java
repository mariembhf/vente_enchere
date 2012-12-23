package com.isamm.dao.impl;



import java.util.Date;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.isamm.dao.*;
import com.isamm.domain.*;

public class AtEnchereDaoImpl {

public final void insererAt_Enchere(AtEnchere ae) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		AtEnchereDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager cr��");
		
		
		AtEnchereDao.insererAt_Enchere(ae);
		
	}


	public final void modifierAt_Enchere(AtEnchere ae) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		AtEnchereDao.em  = emf.createEntityManager();
	
		System.out.println("entity manager cr��");
	
	
		AtEnchereDao.modifierAt_Enchere(ae);
		
	}
	
	public final void supprimerAt_Enchere(AtEnchere ae) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		AtEnchereDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager cr��");
	
		
		AtEnchereDao.supprimerAt_Enchere(ae);
		
		}
	
	public final List<AtEnchere> trouverAtEnchere(int idProduit,int idVenteEnchere) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		AtEnchereDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager cr��");
	
		
		return AtEnchereDao.trouverAtEnchere(idProduit, idVenteEnchere);
		
		}

}
