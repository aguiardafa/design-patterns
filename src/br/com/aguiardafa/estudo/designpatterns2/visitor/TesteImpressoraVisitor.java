package br.com.aguiardafa.estudo.designpatterns2.visitor;

import br.com.aguiardafa.estudo.designpatterns2.interpreter.Divisao;
import br.com.aguiardafa.estudo.designpatterns2.interpreter.Expressao;
import br.com.aguiardafa.estudo.designpatterns2.interpreter.Multiplicacao;
import br.com.aguiardafa.estudo.designpatterns2.interpreter.Numero;
import br.com.aguiardafa.estudo.designpatterns2.interpreter.RaizQuadrada;
import br.com.aguiardafa.estudo.designpatterns2.interpreter.Soma;
import br.com.aguiardafa.estudo.designpatterns2.interpreter.Subtracao;

public class TesteImpressoraVisitor {
	public static void main(String[] args) {
		Expressao esquerda = new Subtracao(new Numero(10), new Divisao(new Numero(10), new Numero(2)));
		Expressao direita = new Soma(new Multiplicacao(new Numero(3), new Numero(7)), new RaizQuadrada(new Numero(4)));

		Expressao conta = new Soma(esquerda, direita);

		int resultado = conta.avalia();
		System.out.println(resultado);
		
		Visitor impressora = new ImpressoraVisitor();
		conta.aceita(impressora);
		
		Visitor impressora2 = new ImpressoraVisitor2();
		System.out.println("");
		conta.aceita(impressora2);
	}
}
