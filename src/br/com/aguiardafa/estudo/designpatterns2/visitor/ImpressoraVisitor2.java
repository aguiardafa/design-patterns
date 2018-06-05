package br.com.aguiardafa.estudo.designpatterns2.visitor;

import br.com.aguiardafa.estudo.designpatterns2.interpreter.Divisao;
import br.com.aguiardafa.estudo.designpatterns2.interpreter.Multiplicacao;
import br.com.aguiardafa.estudo.designpatterns2.interpreter.Numero;
import br.com.aguiardafa.estudo.designpatterns2.interpreter.RaizQuadrada;
import br.com.aguiardafa.estudo.designpatterns2.interpreter.Soma;
import br.com.aguiardafa.estudo.designpatterns2.interpreter.Subtracao;

public class ImpressoraVisitor2 implements Visitor {
	//impressão pré-fixa
	@Override
	public void visitaSoma(Soma soma) {
		System.out.print(" + ");
        System.out.print("(");
        soma.getEsquerda().aceita(this);
        soma.getDireita().aceita(this);
        System.out.print(")");
	}

	@Override
	public void visitaSubtracao(Subtracao subtracao) {
		System.out.print(" - ");
        System.out.print("(");
        subtracao.getEsquerda().aceita(this);
        subtracao.getDireita().aceita(this);
        System.out.print(")");
	}

	@Override
	public void visitaNumero(Numero numero) {
		System.out.print(numero.getNumero());
	}

	@Override
	public void visitaDivisao(Divisao divisao) {
		System.out.print(" / ");
		System.out.print("(");
		divisao.getEsquerda().aceita(this);
		divisao.getDireita().aceita(this);
		System.out.print(")");
	}

	@Override
	public void visitaMultiplicacao(Multiplicacao multiplicacao) {
		System.out.print(" * ");
		System.out.print("(");
		multiplicacao.getEsquerda().aceita(this);
		multiplicacao.getDireita().aceita(this);
		System.out.print(")");
	}

	@Override
	public void visitaRaizQuadrada(RaizQuadrada raizQuadrada) {
		System.out.print(" ²V¨¨ ");
		System.out.print("(");
		raizQuadrada.getExpressao().aceita(this);
		System.out.print(")");
	}
}
