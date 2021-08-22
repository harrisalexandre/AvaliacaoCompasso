package br.com.harris.Atividade2.testes;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import br.com.harris.Atividade2.dao.ProdutoDao;
import br.com.harris.Atividade2.modelo.Produto;
import br.com.harris.Atividade2.util.JPAUtil;

public class CadastroDeProduto {
	
	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		Scanner scan = new Scanner(System.in);
		String str;						
		System.out.println("Seja muito bem vindo a Harris Store");
		
		cadastrarProduto();

		ProdutoDao produtoDao = new ProdutoDao(em);		
		List<Produto> todos = produtoDao.buscarTodos();
		todos.forEach(p -> System.out.println(p.getNome()));


//		System.out.println("O total de produtos cadastrados até o momento é: Nenhum :( clique 1 para cadastrar 3 protudos");
//		str = scan.nextLine();
//		System.out.println("Digite um número.");
//		int numero = scan.nextInt();
//		System.out.println("O numero digitado foi: ");
//		scan.close();			
		

	}
	
	private static void cadastrarProduto() {
		Produto p1 = new Produto("Notebook", "Dell", 1, new BigDecimal("5500"));
		Produto p2 = new Produto("Celular", "Motorola", 1, new BigDecimal("1100"));
		Produto p3 = new Produto("Celular", "Iphone", 1, new BigDecimal("1199"));
		
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);

		em.getTransaction().begin();
		produtoDao.cadastrar(p1);
		produtoDao.cadastrar(p2);
		produtoDao.cadastrar(p3);

		em.getTransaction().commit();
		em.close();
	}
}