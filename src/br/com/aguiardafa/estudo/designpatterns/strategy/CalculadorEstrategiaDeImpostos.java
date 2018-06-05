package br.com.aguiardafa.estudo.designpatterns.strategy;

public class CalculadorEstrategiaDeImpostos {
	public void calculaImposto(Orcamento orcamento, Imposto estrategiaDeImposto) {
		double resultado  = estrategiaDeImposto.calcula(orcamento);
		System.out.println("O imposto é de: " + resultado );
	}
}
