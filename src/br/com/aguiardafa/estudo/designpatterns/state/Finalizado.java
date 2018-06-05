package br.com.aguiardafa.estudo.designpatterns.state;

import br.com.aguiardafa.estudo.designpatterns.strategy.Orcamento;

public class Finalizado implements EstadoDeUmOrcamento {
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados não recebem desconto extra!");
	}

	public void aprova(Orcamento orcamento) {
		// nao pode ser aprovado agora!
		throw new RuntimeException("Orçamento já está em estado finalizado e não pode voltar para aprovado");
	}

	public void reprova(Orcamento orcamento) {
		// nao pode ser aprovado agora!
		throw new RuntimeException("Orçamento já está em estado finalizado e não pode ser reprovado");
	}

	public void finaliza(Orcamento orcamento) {
		// jah estou em finalizado
		throw new RuntimeException("Orçamento já está em estado finalizado");
	}
}
