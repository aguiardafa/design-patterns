package br.com.aguiardafa.estudo.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

import br.com.aguiardafa.estudo.designpatterns.decorator.Filtro;
import br.com.aguiardafa.estudo.designpatterns.decorator.FiltroSaldoMaior;
import br.com.aguiardafa.estudo.designpatterns.decorator.FiltroSaldoMenor;
import br.com.aguiardafa.estudo.designpatterns.strategy.Conta;

public class TesteDeFiltrosDeContas {
	public static void main(String[] args) {
		Conta c1 = new Conta("titular1", 1000000000);
		Conta c2 = new Conta("titular2", 2000);
		Conta c3 = new Conta("titular3", 30);

		List<Conta> listaDeContas = new ArrayList<Conta>();
		listaDeContas.add(c1);
		listaDeContas.add(c2);
		listaDeContas.add(c3);

		Filtro f1 = new FiltroSaldoMaior(new FiltroSaldoMenor());
		System.out.println(f1.filtra(listaDeContas));
	}
}
