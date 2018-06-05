package br.com.aguiardafa.estudo.designpatterns.observer;

import br.com.aguiardafa.estudo.designpatterns.builder.NotaFiscal;

public class EnviadorDeSms implements AcaoAposGerarNotaFiscal{
	public void executaAcao(NotaFiscal nf) {
		System.out.println("enviei por sms");
	}
}
