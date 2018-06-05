package br.com.aguiardafa.estudo.designpatterns2.factory;

public class TesteAloMundoFactory {
	public static void main(String[] args) {
		AloInterface alo = new AloFactory().getAloMundo(Idioma.de);
		alo.getAlo();
	}
}
