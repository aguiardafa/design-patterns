package br.com.aguiardafa.estudo.designpatterns2.command;

import java.time.LocalDate;


/** Classe recebedora */
public class Pedido {
	private String cliente;
	private double valor;
	private Status status;
	private LocalDate dataFinalizacao;

	public Pedido(String cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
	}

	public void paga() {
		this.status = Status.PAGO;
	}

	public void finaliza() {
		this.dataFinalizacao = LocalDate.now();
		this.status = Status.ENTREGUE;
	}

	/**
	 * @return the cliente
	 */
	public String getCliente() {
		return cliente;
	}

	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @return the dataFinalizacao
	 */
	public LocalDate getDataFinalizacao() {
		return dataFinalizacao;
	}

}
