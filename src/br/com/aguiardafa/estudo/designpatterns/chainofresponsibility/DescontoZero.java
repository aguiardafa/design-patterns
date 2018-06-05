package br.com.aguiardafa.estudo.designpatterns.chainofresponsibility;
import br.com.aguiardafa.estudo.designpatterns.strategy.Orcamento;

public class DescontoZero implements Desconto {

	public double desconta(Orcamento orcamento) {
		return 0;
	}

	public void setProximo(Desconto desconto) {
		// nao tem!
	}

}
