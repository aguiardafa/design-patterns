package br.com.aguiardafa.estudo.designpatterns.observer;

import br.com.aguiardafa.estudo.designpatterns.builder.NotaFiscal;

public class Impressora implements AcaoAposGerarNotaFiscal{
	public void executaAcao(NotaFiscal nf) {
		System.out.println("Nota Fiscal impressa");
	}
}
