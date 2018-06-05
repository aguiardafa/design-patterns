package br.com.aguiardafa.estudo.designpatterns.observer;

import br.com.aguiardafa.estudo.designpatterns.builder.NotaFiscal;

public class Multiplicador implements AcaoAposGerarNotaFiscal {
	private double fator;

	public Multiplicador(double fator) {
		this.fator = fator;
	}

	@Override
	public void executaAcao(NotaFiscal nf) {
		System.out.println("O valor da nota multiplicado pelo fator é:" + nf.getValorBruto() * this.fator);
	}

}
