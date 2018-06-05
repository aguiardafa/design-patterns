package br.com.aguiardafa.estudo.designpatterns.strategy;

public class RealizadorDeInvestimentos {
	void realizaInvestimento(Conta conta, Investimento estrategiaDeInvestimento) {
		System.out.println ( "Valor investido: " + conta.getSaldo());
		conta.deposita(estrategiaDeInvestimento.realiza(conta) * 0.75);
		System.out.println ( "Novo saldo: " + conta.getSaldo());
	}
}
