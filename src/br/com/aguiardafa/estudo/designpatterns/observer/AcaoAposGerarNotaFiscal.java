package br.com.aguiardafa.estudo.designpatterns.observer;

import br.com.aguiardafa.estudo.designpatterns.builder.NotaFiscal;

public interface AcaoAposGerarNotaFiscal {
	void executaAcao(NotaFiscal nf);
}
