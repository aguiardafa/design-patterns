package br.com.aguiardafa.estudo.designpatterns.observer;

import java.time.LocalDate;
import java.time.Month;

import br.com.aguiardafa.estudo.designpatterns.builder.ItemDaNota;
import br.com.aguiardafa.estudo.designpatterns.builder.NotaFiscal;
import br.com.aguiardafa.estudo.designpatterns.builder.NotaFiscalBuilder;

public class TesteAcoes {

	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		
		builder.adicionaAcao(new EnviadorDeEmail());
		builder.adicionaAcao(new NotaFiscalDao());
		builder.adicionaAcao(new EnviadorDeSms());
		builder.adicionaAcao(new Impressora());
		builder.adicionaAcao(new Multiplicador(3));
		
		NotaFiscal nf = builder.paraEmpresa("Caelum Ensino")
				.comCnpj("12.345.678/0001-12")
				.comItem(new ItemDaNota("item 1", 200))
				.comItem(new ItemDaNota("item 2", 400))
				.comItem(new ItemDaNota("item 3", 300))
				.comObservacoes("entregar notaFiscal pessoalmente")
				.comDataDefinida(LocalDate.of(2018, Month.JUNE, 14))
				.constroi();
		
		System.out.println(nf.getValorBruto());
	}

}
