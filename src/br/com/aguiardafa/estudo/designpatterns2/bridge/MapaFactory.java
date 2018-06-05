package br.com.aguiardafa.estudo.designpatterns2.bridge;

public class MapaFactory {
	public Mapa getMapa() {
		return new GoogleMaps(); //neste momento optamos por usar o Mapa do Google
	}
}
