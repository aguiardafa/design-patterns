package br.com.aguiardafa.estudo.designpatterns2.facade;

public class ComputadorFacade {
	// Nota-se que todas as chamadas que estão no Facade poderiam ser feitas uma a
	// uma no cliente, porém isso gera muito acoplamento e complexidade para o
	// cliente, por isso a Facade simplifica e unifica esse conjunto de classes que
	// gera muita complexidade.
	
	private Cpu cpu = null;
	private Memoria memoria = null;
	private HardDrive hardDrive = null;

	public ComputadorFacade(Cpu cpu, Memoria memoria, HardDrive hardDrive) {
		this.cpu = cpu;
		this.memoria = memoria;
		this.hardDrive = hardDrive;
	}

	public void ligarComputador() {
		int BOOT_SECTOR = 10;
		int SECTOR_SIZE = 10;
		int BOOT_ADDRESS = 10;
		
		cpu.start();
		String hdBootInfo = hardDrive.read(BOOT_SECTOR, SECTOR_SIZE);
		memoria.load(BOOT_ADDRESS, hdBootInfo);
		cpu.execute();
		memoria.free(BOOT_ADDRESS, hdBootInfo);
	}
}
