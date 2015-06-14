package br.edu.spr.model.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUltil {
	
	private final EntityManagerFactory EMF = Persistence
			.createEntityManagerFactory("sprback");
	
	public JPAUltil() {
	}

	public EntityManager getManeger(){
		return EMF.createEntityManager();
	}
	
}
