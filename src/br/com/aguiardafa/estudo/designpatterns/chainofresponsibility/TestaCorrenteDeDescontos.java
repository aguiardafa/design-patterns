package br.com.aguiardafa.estudo.designpatterns.chainofresponsibility;
import br.com.aguiardafa.estudo.designpatterns.strategy.Item;
import br.com.aguiardafa.estudo.designpatterns.strategy.Orcamento;

public class TestaCorrenteDeDescontos {

	public static void main(String[] args) {
		CalculadorCorrenteDeDescontos calculador = new CalculadorCorrenteDeDescontos();

		Orcamento orcamento = new Orcamento(500.0);
		orcamento.adicionaItem(new Item("CANETA", 250.0));
		orcamento.adicionaItem(new Item("LAPIS", 250.0));
		orcamento.adicionaItem(new Item("borracha", 15.00));

		double desconto = calculador.calcula(orcamento);

		System.out.println(desconto);

	}

}
