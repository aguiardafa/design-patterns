package br.com.aguiardafa.estudo.designpatterns.strategy;

import java.time.LocalDate;

import br.com.aguiardafa.estudo.designpatterns.state.ContaPositiva;
import br.com.aguiardafa.estudo.designpatterns.state.EstadoDeUmaContaBancaria;

public class Conta {
	private String titular;
	public double saldo; //certo seria usar protected e manter as Classes do estado no mesmo pacote
	private String numero;
	private String agencia;
	private LocalDate dataDeAbertura;
	public EstadoDeUmaContaBancaria estadoAtual = new ContaPositiva();

	public Conta(String titular, double saldo, LocalDate dataDeAbertura) {
		this.titular = titular;
		this.saldo = saldo;
		this.dataDeAbertura = dataDeAbertura;

		this.estadoAtual.estabelecerEstado(this);
	}

	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;

		this.estadoAtual.estabelecerEstado(this);
	}

	public Conta(double saldo) {
		this.saldo = saldo;

		this.estadoAtual.estabelecerEstado(this);
	}

	public void saca(double valor) {
		this.estadoAtual.saca(this, valor);
	}

	public void deposita(double valor) {
		this.estadoAtual.deposita(this, valor);
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getAgencia() {
		return agencia;
	}

	public LocalDate getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void setDataDeAbertura(LocalDate dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}
	
	@Override
	public String toString() {
		return "Conta: " + getNumero() + " - Titular: "+ getTitular() + " - Saldo: " + getSaldo() + ";";
	}
}
