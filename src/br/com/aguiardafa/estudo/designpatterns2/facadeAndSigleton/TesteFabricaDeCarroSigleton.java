package br.com.aguiardafa.estudo.designpatterns2.facadeAndSigleton;

public class TesteFabricaDeCarroSigleton {
	public static void main(String[] args) {
		FabricaDeCarroSigleton fabrica = FabricaDeCarroSigleton.getInstancia();
		System.out.println(fabrica.criarCarroFiat());
		System.out.println(fabrica.criarCarroFord());
		System.out.println(fabrica.criarCarroVolks());
		System.out.println(fabrica.gerarRelatorio());

		
		FabricaDeCarroSigleton fabrica2 = FabricaDeCarroSigleton.getInstancia();
		System.out.println(fabrica.criarCarroFiat());
		System.out.println(fabrica2.gerarRelatorio()); //os dados nçao são zerados
		
		// não necessita utilizar uma referência para uma fábrica
		System.out.println(FabricaDeCarroSigleton.getInstancia().gerarRelatorio());
	}
}
