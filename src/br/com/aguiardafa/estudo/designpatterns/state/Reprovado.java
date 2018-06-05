package br.com.aguiardafa.estudo.designpatterns.state;

import br.com.aguiardafa.estudo.designpatterns.strategy.Orcamento;

public class Reprovado implements EstadoDeUmOrcamento {
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos reprovados n�o recebem desconto extra!");
	}

	public void aprova(Orcamento orcamento) {
		// nao pode ser aprovado agora!
		throw new RuntimeException("Or�amento j� est� em estado reprovado e n�o pode ser aprovado");
	}

	public void reprova(Orcamento orcamento) {
		// jah estou em reprovado
		throw new RuntimeException("Or�amento j� est� em estado reprovado");
	}

	public void finaliza(Orcamento orcamento) {
		// daqui posso ir para o estado de finalizado
		orcamento.estadoAtual = new Finalizado();
	}
}
