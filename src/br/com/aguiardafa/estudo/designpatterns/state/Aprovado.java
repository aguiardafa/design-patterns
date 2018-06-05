package br.com.aguiardafa.estudo.designpatterns.state;

import br.com.aguiardafa.estudo.designpatterns.strategy.Orcamento;

public class Aprovado implements EstadoDeUmOrcamento {
	private boolean descontoAplicado = false;
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if (!descontoAplicado) {
			orcamento.valor -= orcamento.valor * 0.02;
			descontoAplicado = true;
		} else
			throw new RuntimeException("Desconto de Orçamento aprovado já foi aplicado");
	}

	public void aprova(Orcamento orcamento) {
		// jah estou em aprovacao
		throw new RuntimeException("Orçamento já está em estado de aprovação");
	}

	public void reprova(Orcamento orcamento) {
		// nao pode ser reprovado agora!
		throw new RuntimeException("Orçamento está em estado de aprovação e não pode ser reprovado");
	}

	public void finaliza(Orcamento orcamento) {
		// daqui posso ir para o estado de finalizado
		orcamento.estadoAtual = new Finalizado();
	}
}
