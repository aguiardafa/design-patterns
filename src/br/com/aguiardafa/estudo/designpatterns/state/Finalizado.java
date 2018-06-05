package br.com.aguiardafa.estudo.designpatterns.state;

import br.com.aguiardafa.estudo.designpatterns.strategy.Orcamento;

public class Finalizado implements EstadoDeUmOrcamento {
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos finalizados n�o recebem desconto extra!");
	}

	public void aprova(Orcamento orcamento) {
		// nao pode ser aprovado agora!
		throw new RuntimeException("Or�amento j� est� em estado finalizado e n�o pode voltar para aprovado");
	}

	public void reprova(Orcamento orcamento) {
		// nao pode ser aprovado agora!
		throw new RuntimeException("Or�amento j� est� em estado finalizado e n�o pode ser reprovado");
	}

	public void finaliza(Orcamento orcamento) {
		// jah estou em finalizado
		throw new RuntimeException("Or�amento j� est� em estado finalizado");
	}
}
