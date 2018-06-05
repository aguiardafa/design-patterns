package br.com.aguiardafa.estudo.designpatterns2.command;

/* Classe teste */
public class PressSwitch {
	public static void main(String[] args) {
		Light lamp = new Light();
		Command switchUp = new FlipUpCommand(lamp);
		Command switchDown = new FlipDownCommand(lamp);

		Switch mySwitch = new Switch();

		mySwitch.storeAndExecute(switchUp);
		mySwitch.storeAndExecute(switchDown);
		mySwitch.storeAndExecute(switchUp);

	}
}