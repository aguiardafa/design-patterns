package br.com.aguiardafa.estudo.designpatterns2.bridge;

public class TesteMapaBridge {

	public static void main(String[] args) {
		// a interface mapa � uma "ponte" para a implementa��o concreta
		// desta forma se precisarmos trocar a API de mapa usado
		// basta trocar a instancia que assina a interface
		Mapa mapa = new GoogleMaps();
		String conteudo = mapa.devolveMapa("Travessa Cunha Galv�o");
		
		//podemos abstrair a cria��o da instancia, encapsulando em uma Factory
		Mapa mapaDaFactory = new MapaFactory().getMapa();
		mapaDaFactory.devolveMapa("Travessa Cunha Galv�o");
		
	}

}
