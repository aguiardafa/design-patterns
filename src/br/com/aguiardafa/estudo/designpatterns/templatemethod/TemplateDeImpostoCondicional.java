package br.com.aguiardafa.estudo.designpatterns.templatemethod;

import br.com.aguiardafa.estudo.designpatterns.strategy.Imposto;
import br.com.aguiardafa.estudo.designpatterns.strategy.Orcamento;

public abstract class TemplateDeImpostoCondicional extends Imposto {
	public TemplateDeImpostoCondicional() {
		super();
	}
	
	public TemplateDeImpostoCondicional(Imposto outroImposto){
		super(outroImposto);
	}

	@Override
	//para evitar tentativa de sobrescrita pelos filhos, afinal impactaria no padrão de logica definido
	public final double calcula(Orcamento orcamento) { 
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		} else {
			return minimaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		}
	}

	protected abstract double minimaTaxacao(Orcamento orcamento); //somente visivel por filhos e mesmo pacote

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
