package br.com.aguiardafa.estudo.designpatterns2.adapter;

import java.util.Calendar;

public interface Relogio {
	// � criada uma camada para abstrair o c�digo legado
	// neste caso a API de data
	public Calendar hoje();
}
