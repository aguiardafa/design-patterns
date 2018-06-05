package br.com.aguiardafa.estudo.designpatterns.chainofresponsibility;

import br.com.aguiardafa.estudo.designpatterns.strategy.Conta;

public interface Resposta {
	 void responde(Requisicao req, Conta conta);
}
