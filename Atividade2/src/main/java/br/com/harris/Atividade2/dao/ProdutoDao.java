package br.com.harris.Atividade2.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.harris.Atividade2.modelo.Produto;

public class ProdutoDao {

	//EntitinyManager
	private EntityManager em;
	public ProdutoDao(EntityManager em) {
		this.em = em;
	}

	//Funcoes
	//Cadastrar
	public void cadastrar(Produto produto) {
		em.persist(produto);
	}
	//Atualizar
	public Produto atualizar(Produto produto) {
        produto.setDataCriacao(LocalDate.now());
        return em.merge(produto);
	}
	//Remover
	public void remover(Produto produto) {
		produto = em.merge(produto);
        em.remove(produto);
	}
	//BuscaId
	public Produto buscarPorId(Long id) {
		return em.find(Produto.class, id);
	}
	//BuscarTodos
	public List<Produto> buscarTodos() {
		String jpql = "SELECT p FROM Produto p";
		return em.createQuery(jpql, Produto.class).getResultList();
	}
	//LimparLista
	public void limparLista() {
        em.createQuery("DELETE FROM Produto").executeUpdate();
    }

}
