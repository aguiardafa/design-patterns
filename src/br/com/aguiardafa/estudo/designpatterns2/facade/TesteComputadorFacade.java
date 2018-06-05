package br.com.aguiardafa.estudo.designpatterns2.facade;

public class TesteComputadorFacade {
	public static void main(String[] args) {
		Cpu cpu = new Cpu();
		Memoria memoria = new Memoria();
		HardDrive HD = new HardDrive();

		ComputadorFacade facade = new ComputadorFacade(cpu, memoria, HD);
		facade.ligarComputador();
		// podemos notar a quantidade de classes e métodos envolvidos quando precisamos
		// inicializar o computador.
		// No entanto, ao usar uma Facade encapsulamos essa complexidade oferecendo uma
		// interface simples e unificada ao cliente evitando acoplamento e complexidade
	}
}
