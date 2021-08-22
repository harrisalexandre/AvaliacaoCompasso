package br.com.harris.Atividade2.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String descricao;
	private Integer quantidade;
	private BigDecimal preco;
	private LocalDate dataCriacao  = LocalDate.now();
	private LocalDate dataAltecacao;
	
	//CONSTRUTOR
	public Produto(String nome, String descricao, Integer quantidade, BigDecimal preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
		this.dataCriacao = LocalDate.now();
	}
	
	public Produto() {
	}

	//GETTERS AND SETTERS
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public LocalDate getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public LocalDate getDataAltecacao() {
		return dataAltecacao;
	}
	public void setDataAltecacao(LocalDate dataAltecacao) {
		this.dataAltecacao = dataAltecacao;
	}
}
