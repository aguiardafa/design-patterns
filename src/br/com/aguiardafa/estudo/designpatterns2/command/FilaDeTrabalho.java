package br.com.aguiardafa.estudo.designpatterns2.command;

import java.util.ArrayList;
import java.util.List;

/** Classe invocadora */
public class FilaDeTrabalho {
	private List<Comando> comandos;

	public FilaDeTrabalho() {
		this.comandos = new ArrayList<Comando>();
	}
	
	public void adiciona(Comando comando) {
        comandos.add(comando);
    }

    public void processa() {
        for(Comando comando : comandos) {
            comando.executa();
        }
    }
}
