package br.com.aguiardafa.estudo.designpatterns.state;

import br.com.aguiardafa.estudo.designpatterns.strategy.Conta;

public class ContaNegativa implements EstadoDeUmaContaBancaria {

	@Override
	public void saca(Conta conta, double valor) {
		throw new RuntimeException("Sua conta está no vermelho. Não é possível sacar!");
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.saldo += valor * 0.95;
		estabelecerEstado(conta);
	}

	@Override
	public void estabelecerEstado(Conta conta) {
		if (conta.saldo > 0)
			conta.estadoAtual = new ContaPositiva();
	}
}
