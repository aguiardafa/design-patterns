package br.com.aguiardafa.estudo.designpatterns2.factory;

public class AloFactory {
	public AloInterface getAloMundo(Idioma idioma) {
		switch (idioma) {
			case en:
				return new AloMundoEnglish();
			case sp:
				return new AloMundoSpanish();
			case de:
				return new AloMundoGerman();
			default:
				return new AloMundoEnglish();
		}
	}
}
