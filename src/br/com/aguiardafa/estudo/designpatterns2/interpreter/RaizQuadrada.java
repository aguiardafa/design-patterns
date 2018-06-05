package br.com.aguiardafa.estudo.designpatterns2.interpreter;

import br.com.aguiardafa.estudo.designpatterns2.visitor.Visitor;

public class RaizQuadrada implements Expressao{

	private Expressao expressao;

	public RaizQuadrada(Expressao expressao) {
		this.expressao = expressao;
	}

	public Expressao getExpressao() {
		return expressao;
	}
	
	@Override
	public int avalia() {
		int resultadoDaexpressao = expressao.avalia();
		return (int) Math.sqrt(resultadoDaexpressao);
	}
	
	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaRaizQuadrada(this);
	}
}
