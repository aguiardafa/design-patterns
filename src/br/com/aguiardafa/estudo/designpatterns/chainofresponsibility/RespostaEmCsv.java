package br.com.aguiardafa.estudo.designpatterns.chainofresponsibility;

import br.com.aguiardafa.estudo.designpatterns.strategy.Conta;

public class RespostaEmCsv implements Resposta {
	private Resposta outraResposta;

	public RespostaEmCsv(Resposta resposta) {
		this.outraResposta = resposta;
	}

	public RespostaEmCsv() {
		this.outraResposta = null; // nao recebi a proxima!
	}

	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.CSV) {
			System.out.println(conta.getTitular() + "," + conta.getSaldo());
		} else if (outraResposta != null) {
			outraResposta.responde(req, conta);
		} else {
			// não existe próxima na corrente, e ninguém atendeu a requisição!
			// poderíamos não ter feito nada aqui, caso não fosse necessário!
			throw new RuntimeException("Formato de resposta não encontrado");
		}
	}
}