package br.com.aguiardafa.estudo.designpatterns.strategy;

public class MODERADO implements Investimento {

	@Override
	public double realiza(Conta conta) {
		boolean escolhido = new java.util.Random().nextDouble() > 0.50;
		if (escolhido) {
			return conta.getSaldo() * 0.025;
		} else {
			return conta.getSaldo() * 0.007;
		}
	}

}
