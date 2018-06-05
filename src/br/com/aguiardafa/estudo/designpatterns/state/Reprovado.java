package br.com.aguiardafa.estudo.designpatterns.state;

import br.com.aguiardafa.estudo.designpatterns.strategy.Orcamento;

public class Reprovado implements EstadoDeUmOrcamento {
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não recebem desconto extra!");
	}

	public void aprova(Orcamento orcamento) {
		// nao pode ser aprovado agora!
		throw new RuntimeException("Orçamento já está em estado reprovado e não pode ser aprovado");
	}

	public void reprova(Orcamento orcamento) {
		// jah estou em reprovado
		throw new RuntimeException("Orçamento já está em estado reprovado");
	}

	public void finaliza(Orcamento orcamento) {
		// daqui posso ir para o estado de finalizado
		orcamento.estadoAtual = new Finalizado();
	}
}
