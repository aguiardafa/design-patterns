package br.com.aguiardafa.estudo.designpatterns.templatemethod;

import java.time.LocalDate;
import java.util.List;

import br.com.aguiardafa.estudo.designpatterns.strategy.Conta;

public class RelatorioComplexo extends Relatorio {

	@Override
	protected void cabecalho() {
		System.out.println("Banco XYZ");
		System.out.println("Avenida Paulista, 1234");
		System.out.println("(11) 1234-5678");
	}

	@Override
	protected void rodape() {
		System.out.println("banco@xyz.com.br");
		System.out.println(LocalDate.now());
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println(conta.getTitular() + " - " + conta.getNumero() + " - " + conta.getAgencia() + " - "
					+ conta.getSaldo());
		}
	}

}
