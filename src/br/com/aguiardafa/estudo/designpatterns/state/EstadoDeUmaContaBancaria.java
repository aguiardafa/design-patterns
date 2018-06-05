package br.com.aguiardafa.estudo.designpatterns.state;

import br.com.aguiardafa.estudo.designpatterns.strategy.Conta;

public interface EstadoDeUmaContaBancaria {
	void saca(Conta conta, double valor);

	void deposita(Conta conta, double valor);
	
	void estabelecerEstado(Conta conta);
}
