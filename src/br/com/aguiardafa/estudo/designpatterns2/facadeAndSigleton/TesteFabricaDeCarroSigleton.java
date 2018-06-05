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
		System.out.println(fabrica2.gerarRelatorio()); //os dados n�ao s�o zerados
		
		// n�o necessita utilizar uma refer�ncia para uma f�brica
		System.out.println(FabricaDeCarroSigleton.getInstancia().gerarRelatorio());
	}
}
