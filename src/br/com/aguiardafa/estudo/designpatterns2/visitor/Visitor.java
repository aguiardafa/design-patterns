package br.com.aguiardafa.estudo.designpatterns2.visitor;

import br.com.aguiardafa.estudo.designpatterns2.interpreter.Divisao;
import br.com.aguiardafa.estudo.designpatterns2.interpreter.Multiplicacao;
import br.com.aguiardafa.estudo.designpatterns2.interpreter.Numero;
import br.com.aguiardafa.estudo.designpatterns2.interpreter.RaizQuadrada;
import br.com.aguiardafa.estudo.designpatterns2.interpreter.Soma;
import br.com.aguiardafa.estudo.designpatterns2.interpreter.Subtracao;

public interface Visitor {
	void visitaSoma(Soma soma);
    void visitaSubtracao(Subtracao subtracao);
    void visitaNumero(Numero numero);
	void visitaDivisao(Divisao divisao);
	void visitaMultiplicacao(Multiplicacao multiplicacao);
	void visitaRaizQuadrada(RaizQuadrada raizQuadrada);
}
