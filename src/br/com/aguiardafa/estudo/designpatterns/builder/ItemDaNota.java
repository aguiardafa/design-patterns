package br.com.aguiardafa.estudo.designpatterns.builder;

public class ItemDaNota {
	private String nome;
	private double valor;

	public ItemDaNota(String nome, double valor) {
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
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * @param valor
	 *            the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}

}
