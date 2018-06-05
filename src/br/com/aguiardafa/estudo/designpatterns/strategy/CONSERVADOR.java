package br.com.aguiardafa.estudo.designpatterns.strategy;

public class CONSERVADOR implements Investimento {

	@Override
	public double realiza(Conta conta) {
		return conta.getSaldo() * 0.008;
	}

}
