package br.com.aguiardafa.estudo.designpatterns2.factory;

public class AloMundoGerman implements AloInterface {

	@Override
	public void getAlo() {
		System.out.println("Hallo Welt!!!");
	}

}
