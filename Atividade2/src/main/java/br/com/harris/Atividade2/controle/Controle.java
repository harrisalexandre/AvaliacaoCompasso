package br.com.harris.Atividade2.controle;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.harris.Atividade2.dao.ProdutoDao;
import br.com.harris.Atividade2.util.JPAUtil;
import br.com.harris.Atividade2.modelo.Produto;

public class Controle implements AutoCloseable {
	
	 private ProdutoDao dao;
	 private EntityManager em;
	 
	 public Controle(){
	        this.em = JPAUtil.getEntityManager();
	        this.dao = new ProdutoDao(em);

	        em.getTransaction().begin();
	        dao.limparLista();
	        em.getTransaction().commit();
	        em.clear();
	    }
	 
	 public void cadastrar(Produto p){
	        em.getTransaction().begin();
	        dao.cadastrar(p);
	        em.getTransaction().commit();
	        em.clear();
	    }

	    public void atualizar(Produto p){
	        em.getTransaction().begin();
	        p = dao.atualizar(p);
	        em.getTransaction().commit();
	        em.clear();
	    }

	    public void remover(Produto p){
	        em.getTransaction().begin();
	        dao.remover(p);
	        em.getTransaction().commit();
	        em.clear();
	    }

	    public void close() {
	        this.em.close();
	    }

	}
