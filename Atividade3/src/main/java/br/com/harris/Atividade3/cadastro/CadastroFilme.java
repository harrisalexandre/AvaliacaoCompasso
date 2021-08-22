package br.com.harris.Atividade3.cadastro;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.harris.Atividade3.dao.ProdutoDao;
import br.com.harris.Atividade3.modelo.Filme;
import br.com.harris.Atividade3.util.JPAUtil;

public class CadastroFilme {
	public static void main(String[] args) {
		Filme filme1 = new Filme("Naruto O Filme", "O Confronto Ninja no Pais da Neve", 2004);
		Filme filme2 = new Filme("Naruto O Filme", "As Ruínas Fantasmas nos Confins da Terra", 2005);
		Filme filme3 = new Filme("Naruto O Filme", "A Revolta dos Animais da Lua Crescente", 2006);
		Filme filme4 = new Filme("Naruto Shippuden", "O Filme", 2007);
		Filme filme5 = new Filme("Naruto Shippuden", "Laços", 2008);
		
		Filme filme6 = new Filme("Naruto Shippuden", "Herdeiros da Vontade de Fogo", 2009);
		Filme filme7 = new Filme("Naruto Shippuden", "A Última Torre", 2010);
		Filme filme8 = new Filme("Naruto Shippuden O Filme", "Prisão de Sangue", 2011);
		Filme filme9 = new Filme("Road to Ninja", "Naruto the Movie", 2012);
		Filme filme10 = new Filme("The Last Naruto", "O Filme", 2014);
		
		Filme filme11 = new Filme("Boruto", "Naruto O Filme", 2015);
		Filme filme12 = new Filme("A Felicidade Não se Compra", "Frank Capra", 1946);
		Filme filme13 = new Filme("A Felicidade Não se Compra", "Frank Capra", 1946);
		Filme filme14 = new Filme("A Felicidade Não se Compra", "Frank Capra", 1946);
		Filme filme15 = new Filme("A Felicidade Não se Compra", "Frank Capra", 1946);
		

		Filme filme16 = new Filme("A Felicidade Não se Compra", "Frank Capra", 1946);
		Filme filme17 = new Filme("A Felicidade Não se Compra", "Frank Capra", 1946);
		Filme filme18 = new Filme("A Felicidade Não se Compra", "Frank Capra", 1946);
		Filme filme19 = new Filme("A Felicidade Não se Compra", "Frank Capra", 1946);
		Filme filme20 = new Filme("A Felicidade Não se Compra", "Frank Capra", 1946);
	
	}
}
	
//	EntityManager em = JPAUtil.getEntityManager();
//	ProdutoDao produtoDao = new ProdutoDao(em);
