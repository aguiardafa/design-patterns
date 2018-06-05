package br.com.aguiardafa.estudo.designpatterns.state;

import br.com.aguiardafa.estudo.designpatterns.strategy.Conta;

public class ContaPositiva implements EstadoDeUmaContaBancaria {

	@Override
	public void saca(Conta conta, double valor) {
		conta.saldo -= valor;
		estabelecerEstado(conta);
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.saldo += valor * 0.98;
	}

	@Override
	public void estabelecerEstado(Conta conta) {
		if (conta.saldo < 0)
			conta.estadoAtual = new ContaNegativa();
	}
}
