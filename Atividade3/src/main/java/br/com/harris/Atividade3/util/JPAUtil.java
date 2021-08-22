package br.com.harris.Atividade3.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static final EntityManagerFactory FACTORY = Persistence
			.createEntityManagerFactory("Atividade3");

	public static EntityManager getEntityManager() { 
		return FACTORY.createEntityManager();
	}
	
}