package br.com.aguiardafa.estudo.designpatterns.decorator;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import br.com.aguiardafa.estudo.designpatterns.strategy.Conta;

public class FiltroDataDeAbertura extends Filtro {

	public FiltroDataDeAbertura() {
		super();
	}

	public FiltroDataDeAbertura(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> listaFiltrada = contas.stream()
				.filter(conta -> (conta.getDataDeAbertura().getMonth().equals(LocalDate.now().getMonth()) && 
								  conta.getDataDeAbertura().getYear() == LocalDate.now().getYear()))
				.collect(Collectors.toList());
		listaFiltrada.addAll(filtrandoComOutroFiltro(contas));
		return listaFiltrada;
	}

}
