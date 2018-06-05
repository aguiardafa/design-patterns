package br.com.aguiardafa.estudo.designpatterns.strategy;

public class ARROJADO implements Investimento {

	@Override
	public double realiza(Conta conta) {
		int chute = new java.util.Random().nextInt(10);
		if (chute >= 0 && chute <= 1) {
			return conta.getSaldo() * 0.05;
		} else if (chute >= 2 && chute <= 4) {
			return conta.getSaldo() * 0.03;
		} else {
			return conta.getSaldo() * 0.006;
		}
	}

}
