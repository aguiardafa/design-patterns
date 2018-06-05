package br.com.aguiardafa.estudo.designpatterns2.adapter;

import java.util.Calendar;

public class RelogioComCalendar implements Relogio{

	@Override
	public Calendar hoje() {
		return Calendar.getInstance(); //consome a API legada
	}

}
