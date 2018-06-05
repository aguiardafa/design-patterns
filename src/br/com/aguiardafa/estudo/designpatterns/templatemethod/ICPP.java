package br.com.aguiardafa.estudo.designpatterns.templatemethod;

import br.com.aguiardafa.estudo.designpatterns.strategy.Imposto;
import br.com.aguiardafa.estudo.designpatterns.strategy.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional {
	public ICPP() {}
    public ICPP(Imposto outroImposto) {
        super(outroImposto);
    }
	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}

}
