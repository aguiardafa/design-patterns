package br.com.aguiardafa.estudo.designpatterns2.flyweigth;

import java.util.List;

import org.jfugue.player.Player;

public class Piano {
	public void toca(List<Nota> musica) {
		Player player = new Player();
		
		StringBuilder musicaEmNotas = new StringBuilder();
		musica.stream().forEach(nota -> musicaEmNotas.append(nota.simbolo() + " "));
		
		player.play(musicaEmNotas.toString());
	}
}
