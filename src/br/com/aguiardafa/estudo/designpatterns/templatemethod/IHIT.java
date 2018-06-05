package br.com.aguiardafa.estudo.designpatterns.templatemethod;

import br.com.aguiardafa.estudo.designpatterns.strategy.Imposto;
import br.com.aguiardafa.estudo.designpatterns.strategy.Orcamento;

public class IHIT extends TemplateDeImpostoCondicional{
	public IHIT() {}
    public IHIT(Imposto outroImposto) {
        super(outroImposto);
    }
	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (0.01 * orcamento.getItens().size());
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100.0;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.existeItemComMesmoNome();
	}

}
