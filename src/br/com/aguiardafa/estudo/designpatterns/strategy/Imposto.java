package br.com.aguiardafa.estudo.designpatterns.strategy;

//public interface Imposto {
//foi transformada a interface em classe abstrata para implementar o padrao decorator
//onde a dependencia em as classes são passadas pelo construtor
public abstract class Imposto {
	protected final Imposto outroImposto;

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	// construtor default
	public Imposto() {
		this.outroImposto = null;
	}

	protected double calculoDoOutroImposto(Orcamento orcamento) {
		// tratando o caso do proximo imposto nao existir!
		return (outroImposto == null? 0 : outroImposto.calcula(orcamento));
	}

	public abstract double calcula(Orcamento orcamento);
}
