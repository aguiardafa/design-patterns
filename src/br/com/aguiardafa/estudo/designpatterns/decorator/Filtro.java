package br.com.aguiardafa.estudo.designpatterns.decorator;

import java.util.ArrayList;
import java.util.List;

import br.com.aguiardafa.estudo.designpatterns.strategy.Conta;

public abstract class Filtro {
	protected final Filtro outroFiltro;

	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}

	public Filtro() {
		this.outroFiltro = null;
	}

	public abstract List<Conta> filtra(List<Conta> contas);

	protected List<Conta> filtrandoComOutroFiltro(List<Conta> contas) {
		// tratando o caso do proximo imposto nao existir!
		return (outroFiltro == null ? new ArrayList<Conta>() : outroFiltro.filtra(contas));
	}
}
