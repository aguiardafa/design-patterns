package br.com.aguiardafa.estudo.designpatterns.chainofresponsibility;
import br.com.aguiardafa.estudo.designpatterns.strategy.Orcamento;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximoDesconto;

	@Override
	public double desconta(Orcamento orcamento) {
		if (orcamento.existeItem("LAPIS") && orcamento.existeItem("CANETA")) {
			return orcamento.getValor() * 0.07;
		} else {
			return proximoDesconto.desconta(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximoDesconto = proximo;

	}

}
