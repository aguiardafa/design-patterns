package br.com.aguiardafa.estudo.designpatterns.templatemethod;

import java.util.List;

import br.com.aguiardafa.estudo.designpatterns.strategy.Conta;

public abstract class Relatorio {
	protected abstract void cabecalho();

	protected abstract void rodape();

	protected abstract void corpo(List<Conta> contas);

	public final void imprime(List<Conta> contas) {
		timbre();
		cabecalho();
		corpo(contas);
		rodape();
	}

	private final void timbre() {
		System.out.println("Timbre do Banco");
	}
}
