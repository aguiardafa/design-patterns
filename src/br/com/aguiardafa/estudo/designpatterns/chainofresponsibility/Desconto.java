package br.com.aguiardafa.estudo.designpatterns.chainofresponsibility;
import br.com.aguiardafa.estudo.designpatterns.strategy.Orcamento;

public interface Desconto {
	double desconta(Orcamento orcamento);

	void setProximo(Desconto proximo);
}
