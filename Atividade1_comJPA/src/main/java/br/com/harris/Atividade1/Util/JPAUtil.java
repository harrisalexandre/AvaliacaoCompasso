package br.com.harris.Atividade1.Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static final EntityManagerFactory FACTORY = Persistence
			.createEntityManagerFactory("Atividade1_comJPA");

	public static EntityManager getEntityManager() { 
		return FACTORY.createEntityManager();
	}
	
}