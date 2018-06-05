package br.com.aguiardafa.estudo.designpatterns.builder;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class TesteDaNotaFiscal {
	public static void main(String[] args) {
		// dados necessário para criar a nota
		String empresa = "Caelum Ensino";
		String cnpj = "12.345.678/0001-12";
		List<ItemDaNota> itens = Arrays.asList(new ItemDaNota("item 1", 200), new ItemDaNota("item 2", 400),
				new ItemDaNota("item 3", 300));

		double valorBruto = itens.stream().mapToDouble(ItemDaNota::getValor).sum();
		double impostos = valorBruto * 0.05;
		// construindo a nota
		NotaFiscal notaFiscal = new NotaFiscal(empresa, cnpj, LocalDate.now(), valorBruto, impostos, itens,
				"observacoes");

		System.out.println(notaFiscal.getValorBruto());
		
		// melhor cenário ter uma classe para coletar esses dados necessário para criar a
		// nota
		NotaFiscalBuilder builder = new NotaFiscalBuilder().paraEmpresa("Caelum Ensino")
															.comCnpj("12.345.678/0001-12")
															.comItem(new ItemDaNota("item 1", 200))
															.comItem(new ItemDaNota("item 2", 400))
															.comItem(new ItemDaNota("item 3", 300))
															.comObservacoes("observacao")
															.comDataDefinida(LocalDate.of(2018, Month.JUNE, 14));
		
		NotaFiscal nfComBuilder = builder.constroi();

		System.out.println(nfComBuilder.getValorBruto());
	}
}
