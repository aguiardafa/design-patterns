package br.com.aguiardafa.estudo.designpatterns2.adapter;

import java.util.Calendar;

public interface Relogio {
	// é criada uma camada para abstrair o código legado
	// neste caso a API de data
	public Calendar hoje();
}
