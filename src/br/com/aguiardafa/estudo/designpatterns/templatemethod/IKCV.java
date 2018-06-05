package br.com.aguiardafa.estudo.designpatterns.templatemethod;

import br.com.aguiardafa.estudo.designpatterns.strategy.Imposto;
import br.com.aguiardafa.estudo.designpatterns.strategy.Orcamento;

public class IKCV extends TemplateDeImpostoCondicional {
	public IKCV() {}

    public IKCV(Imposto outroImposto) {
        super(outroImposto);
    }
	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && orcamento.temItemMaiorQue100Reais();
	}

}
