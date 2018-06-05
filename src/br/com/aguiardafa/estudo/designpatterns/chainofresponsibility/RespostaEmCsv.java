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
			// n�o existe pr�xima na corrente, e ningu�m atendeu a requisi��o!
			// poder�amos n�o ter feito nada aqui, caso n�o fosse necess�rio!
			throw new RuntimeException("Formato de resposta n�o encontrado");
		}
	}
}