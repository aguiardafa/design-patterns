package br.com.aguiardafa.estudo.designpatterns.builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.aguiardafa.estudo.designpatterns.observer.AcaoAposGerarNotaFiscal;

public class NotaFiscalBuilder {
	private String razaoSocial;
	private String cnpj;
	private double valorBruto;
	private double impostos;
	private String observacao;
	private LocalDate dataDeEmissao;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();

	private List<AcaoAposGerarNotaFiscal> todasAcoesASeremExecutadas;

	// se tivermos alguma variável obritória para a construção da NotaFiscal,
	// faz-se necessário um construtor no builder, recebendo este atributo da classe
	// public NotaFiscalBuilder(double valorBruto) {
	// this.valorBruto = valorBruto;
	// }

	// Recebendo a lista pelo construtor garantimos que, no momento da construção do
	// builder, já teremos todas as ações que devem ser executadas após a geração da
	// nota, e não haveria possibilidade dos clientes dessa classe a instanciarem
	// sem definir essa lista primeiro.
	public NotaFiscalBuilder(List<AcaoAposGerarNotaFiscal> todasAcoes) {
		this.todasAcoesASeremExecutadas.addAll(todasAcoes);
		this.dataDeEmissao = LocalDate.now();
		this.todasAcoesASeremExecutadas = new ArrayList<AcaoAposGerarNotaFiscal>();
	}

	public NotaFiscalBuilder() {
		this.dataDeEmissao = LocalDate.now();
		this.todasAcoesASeremExecutadas = new ArrayList<AcaoAposGerarNotaFiscal>();
	}

	public void adicionaAcao(AcaoAposGerarNotaFiscal acao) {
		this.todasAcoesASeremExecutadas.add(acao);
	}

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this; // retorno eu mesmo, o próprio builder, para o cliente continuar usando
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder comItem(ItemDaNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}

	public NotaFiscalBuilder comItens(List<ItemDaNota> itens) {
		todosItens.addAll(itens);

		valorBruto += itens.stream().mapToDouble(ItemDaNota::getValor).sum();
		impostos += itens.stream().mapToDouble(ItemDaNota::getValor).sum() * 0.05;

		return this;
	}

	public NotaFiscalBuilder comObservacoes(String observacao) {
		this.observacao = observacao;
		return this;
	}

	public NotaFiscalBuilder comDataDefinida(LocalDate data) {
		this.dataDeEmissao = data;
		return this;
	}

	// public NotaFiscalBuilder naDataAtual() {
	// this.dataDeEmissao = LocalDate.now();
	// return this;
	// }

	public NotaFiscal constroi() {
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, dataDeEmissao, valorBruto, impostos, todosItens, observacao);

		for (AcaoAposGerarNotaFiscal acaoAposGerarNotaFiscal : todasAcoesASeremExecutadas) {
			acaoAposGerarNotaFiscal.executaAcao(nf);
		}

		return nf;
	}
}
