package br.com.harris.Atividade3.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.harris.Atividade3.modelo.Filme;

public class ProdutoDao {

	private EntityManager em;

	public ProdutoDao(EntityManager em) {
		this.em = em;
	}

	public void cadastrar(Filme produto) {
		this.em.persist(produto);
	}

	public void atualizar(Filme produto) {
		this.em.merge(produto);
	}

	public void remover(Filme produto) {
		produto = em.merge(produto);
		this.em.remove(produto);
	}

	public Filme buscarPorId(Long id) {
		return em.find(Filme.class, id);
	}

	public List<Filme> buscarTodos() {
		String jpql = "SELECT p FROM Produto p";
		return em.createQuery(jpql, Filme.class).getResultList();
	}
}
