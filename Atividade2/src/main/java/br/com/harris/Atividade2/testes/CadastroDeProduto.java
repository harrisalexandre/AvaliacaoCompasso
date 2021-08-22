package br.com.harris.Atividade2.testes;

import java.math.BigDecimal;

import br.com.harris.Atividade2.controle.Controle;
import br.com.harris.Atividade2.modelo.Produto;

public class CadastroDeProduto implements AutoCloseable {
	
	private final Controle control = new  Controle();

	private Produto dell = new Produto("Notebook", "Dell G7-7588", 1, new BigDecimal("5500"));
	private Produto apple = new Produto("Iphone", "6s 64gb", 1, new BigDecimal("1100"));
	private Produto motorola = new Produto("Motorola", "E7 plus 128gb", 1, new BigDecimal("1199"));
	
	public void cadastrarProdutos() {
		System.out.println("Cadastrando: " + dell.toString());
		control.cadastrar(dell);

		System.out.println("Cadastrando: " + dell.toString());
		control.cadastrar(apple);

		System.out.println("Cadastrando: " + dell.toString());
		control.cadastrar(motorola);
	}
	
	public void atualizaProduto() {
		System.out.println("Atualizando dados do PRIMEIRO produto: " + dell.toString());
		dell.setNome("XPS");
		dell.setDescricao("L 502X");
		dell.setPreco(new BigDecimal("2000"));
		dell.setQuantidade(1);
		
		System.out.println("Para: " + dell.toString());
		
		control.atualizar(dell);
	}
	
	public void apagarProduto() {
		System.out.println("Apagando dado do SEGUNDO produto: " + apple.toString());
		
		control.remover(apple);
	}
	
	@Override
	public void close() {
		control.close();
}
}