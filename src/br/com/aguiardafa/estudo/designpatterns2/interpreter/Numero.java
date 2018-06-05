package br.com.aguiardafa.estudo.designpatterns2.interpreter;

import br.com.aguiardafa.estudo.designpatterns2.visitor.Visitor;

public class Numero implements Expressao {

	private int numero;

	public Numero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return this.numero;
	}

	@Override
	public int avalia() {
		return numero;
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaNumero(this);
	}
}