package br.com.aguiardafa.estudo.designpatterns.state;

import br.com.aguiardafa.estudo.designpatterns.strategy.Orcamento;

public interface EstadoDeUmOrcamento {
	void aplicaDescontoExtra(Orcamento orcamento);
	void aprova(Orcamento orcamento);
    void reprova(Orcamento orcamento);
    void finaliza(Orcamento orcamento);
}
