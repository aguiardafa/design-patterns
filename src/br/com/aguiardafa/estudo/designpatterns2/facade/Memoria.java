package br.com.aguiardafa.estudo.designpatterns2.facade;

public class Memoria {
	public void load(int position, String info) {
		System.out.println("carrega dados na memória");
	}
	public void free(int position, String info) {
		System.out.println("libera dados da memória");
	}
}
