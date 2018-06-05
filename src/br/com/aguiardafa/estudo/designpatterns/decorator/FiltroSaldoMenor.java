package br.com.aguiardafa.estudo.designpatterns.decorator;

import java.util.List;
import java.util.stream.Collectors;

import br.com.aguiardafa.estudo.designpatterns.strategy.Conta;

public class FiltroSaldoMenor extends Filtro {

	public FiltroSaldoMenor() {
		super();
	}

	public FiltroSaldoMenor(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> listaFiltrada = contas.stream().filter(conta -> conta.getSaldo() < 100)
				.collect(Collectors.toList());

		listaFiltrada.addAll(filtrandoComOutroFiltro(contas));
		return listaFiltrada;
	}

}
