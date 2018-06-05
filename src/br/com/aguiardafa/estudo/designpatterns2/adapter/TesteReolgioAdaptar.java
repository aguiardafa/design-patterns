package br.com.aguiardafa.estudo.designpatterns2.adapter;

import java.util.Calendar;

public class TesteReolgioAdaptar {

	public static void main(String[] args) {
		Relogio relogio = new RelogioComCalendar(); 
		Calendar agora = relogio.hoje();
		System.out.println(agora.getTime());
	}

}
