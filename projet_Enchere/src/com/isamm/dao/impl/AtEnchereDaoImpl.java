package com.isamm.dao.impl;



import java.util.Date;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.isamm.dao.*;
import com.isamm.domain.*;

public class AtEnchereDaoImpl {

public final void insererAt_Enchere() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		AtEnchereDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager créé");
		
		AtEnchere ae = new AtEnchere();
		ae.setDate(new Date());
		AtEnchereDao.insererAt_Enchere(ae);
		
	}


	public final void modifierAt_Enchere(AtEnchere ae) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		AtEnchereDao.em  = emf.createEntityManager();
	
		System.out.println("entity manager créé");
	
	
		AtEnchereDao.modifierAt_Enchere(ae);
		
	}
	
	public final void supprimerAt_Enchere(AtEnchere ae) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetEnchere");
		AtEnchereDao.em  = emf.createEntityManager();
		
		System.out.println("entity manager créé");
	
		
		AtEnchereDao.supprimerAt_Enchere(ae);
		
		}

}
