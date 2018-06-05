package br.com.aguiardafa.estudo.designpatterns.templatemethod;

import br.com.aguiardafa.estudo.designpatterns.strategy.CalculadorEstrategiaDeImpostos;
import br.com.aguiardafa.estudo.designpatterns.strategy.Imposto;
import br.com.aguiardafa.estudo.designpatterns.strategy.Item;
import br.com.aguiardafa.estudo.designpatterns.strategy.Orcamento;

public class TesteTemplateDeImpostoCondicional {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500.0);
		orcamento.adicionaItem(new Item("CANETA", 250.0));
		orcamento.adicionaItem(new Item("LAPIS", 250.0));
		orcamento.adicionaItem(new Item("borracha", 15.00));

		Imposto novoImposto = new ICPP();
		CalculadorEstrategiaDeImpostos calc = new CalculadorEstrategiaDeImpostos();
		calc.calculaImposto(orcamento, novoImposto);
	}
}
