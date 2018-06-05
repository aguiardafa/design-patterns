package br.com.aguiardafa.estudo.designpatterns.chainofresponsibility;

import br.com.aguiardafa.estudo.designpatterns.strategy.Conta;

public class TesteCorrenteDeRespostas {
	public static void main(String[] args) {
		Conta conta = new Conta("Teste", 500.0);
		Requisicao req = new Requisicao(Formato.XML);
		
		Resposta resposta = RespostasConstrutor.buildResposta();
		resposta.responde(req, conta);
	}
}
