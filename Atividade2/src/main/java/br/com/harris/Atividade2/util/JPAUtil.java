package br.com.harris.Atividade2.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static final EntityManagerFactory FACTORY = Persistence
			.createEntityManagerFactory("Atividade2");

	public static EntityManager getEntityManager() { 
		return FACTORY.createEntityManager();
	}
	
}