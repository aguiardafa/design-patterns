package br.com.aguiardafa.estudo.designpatterns2.memento;

import java.time.LocalDate;

public class TesteMemento {
	public static void main(String[] args) {
		Historico historico = new Historico();

		Contrato contrato = new Contrato(LocalDate.now(), "Mauricio", TipoContrato.NOVO);
		historico.adiciona(contrato.salvaEstado());

		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());
		System.out.println(contrato.getTipo());

		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());
		System.out.println(contrato.getTipo());

		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());
		System.out.println(contrato.getTipo());
		
		contrato.restauraEstado(historico.pega(1));
		System.out.println(contrato.getTipo());
	}
}
