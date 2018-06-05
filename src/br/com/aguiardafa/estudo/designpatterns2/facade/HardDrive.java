package br.com.aguiardafa.estudo.designpatterns2.facade;

public class HardDrive {
	public String read(int startPosition, int size) {
		System.out.println("lê dados do HD");
		return "HardDrive";
	}
	public void write(int position, String info) {
		System.out.println("escreve dados no HD");
	}
}
