package br.com.aguiardafa.estudo.designpatterns.builder;

import java.time.LocalDate;
import java.util.List;

public class NotaFiscal {
	private String RazaoSocial;
	private String cnpj;
	private LocalDate dataDeEmissao;
	private double valorBruto;
	private double impostos;
	private String observacoes;
	public List<ItemDaNota> itens;

	public NotaFiscal(String razaoSocial, String cnpj, LocalDate dataDeEmissao, double valorBruto, double impostos,
			List<ItemDaNota> itens, String observacoes) {
		super();
		RazaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.dataDeEmissao = dataDeEmissao;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.itens = itens;
		this.observacoes = observacoes;
	}

	/**
	 * @return the razaoSocial
	 */
	public String getRazaoSocial() {
		return RazaoSocial;
	}

	/**
	 * @param razaoSocial
	 *            the razaoSocial to set
	 */
	public void setRazaoSocial(String razaoSocial) {
		RazaoSocial = razaoSocial;
	}

	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj
	 *            the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * @return the dataDeEmissao
	 */
	public LocalDate getDataDeEmissao() {
		return dataDeEmissao;
	}

	/**
	 * @param dataDeEmissao
	 *            the dataDeEmissao to set
	 */
	public void setDataDeEmissao(LocalDate dataDeEmissao) {
		this.dataDeEmissao = dataDeEmissao;
	}

	/**
	 * @return the valorBruto
	 */
	public double getValorBruto() {
		return valorBruto;
	}

	/**
	 * @param valorBruto
	 *            the valorBruto to set
	 */
	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}

	/**
	 * @return the impostos
	 */
	public double getImpostos() {
		return impostos;
	}

	/**
	 * @param impostos
	 *            the impostos to set
	 */
	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}

	/**
	 * @return the itens
	 */
	public List<ItemDaNota> getItens() {
		return itens;
	}

	/**
	 * @param itens
	 *            the itens to set
	 */
	public void setItens(List<ItemDaNota> itens) {
		this.itens = itens;
	}

	/**
	 * @return the observacoes
	 */
	public String getObservacoes() {
		return observacoes;
	}

	/**
	 * @param observacoes
	 *            the observacoes to set
	 */
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

}
