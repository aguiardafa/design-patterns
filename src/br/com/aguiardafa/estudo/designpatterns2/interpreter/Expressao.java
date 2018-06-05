package br.com.aguiardafa.estudo.designpatterns2.interpreter;

import br.com.aguiardafa.estudo.designpatterns2.visitor.Visitor;

public interface Expressao {
	int avalia();
	void aceita(Visitor visitor);
}
