package br.com.harris.Atividade1_comJPA.testes;

import javax.persistence.EntityManager;

import br.com.harris.Atividade1.Util.JPAUtil;
import br.com.harris.Atividade1_comJPA.dao.ProdutoDao;
import br.com.harris.Atividade1_comJPA.modelo.Produto;

public class CadastroDeProduto {
	public static void main(String[] args) {
		cadastrarProduto();
		
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);
		
		Produto p = produtoDao.buscarPorId(1l);
		System.out.println(p.getNome());
		
	}

	private static void cadastrarProduto() {
		Produto notebook = new Produto("Notebook", "Dell G7");
		
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);
			
		em.getTransaction().begin();
		produtoDao.cadastrar(notebook);

		em.close();
	}
}
	
