package br.com.aguiardafa.estudo.designpatterns.strategy;

public class Item {
	private final String nome;
	private final double valor;
	
	
	public Item(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}
	
	
}
