package br.com.aguiardafa.estudo.designpatterns.decorator;

import br.com.aguiardafa.estudo.designpatterns.strategy.Imposto;
import br.com.aguiardafa.estudo.designpatterns.strategy.Orcamento;

public class ImpostoMuitoAlto extends Imposto{
	public ImpostoMuitoAlto() {
		super();
	}
	
	public ImpostoMuitoAlto(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.2 + calculoDoOutroImposto(orcamento);
	}

}
