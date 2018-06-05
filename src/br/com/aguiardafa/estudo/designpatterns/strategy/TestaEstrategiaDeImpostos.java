package br.com.aguiardafa.estudo.designpatterns.strategy;

public class TestaEstrategiaDeImpostos {

	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500.0);
        Imposto novoImposto = new ICCC();
        CalculadorEstrategiaDeImpostos calc = new CalculadorEstrategiaDeImpostos();
        calc.calculaImposto(reforma, novoImposto); 	
        
        Conta conta = new Conta(100.0);
        Investimento novoInvestimento = new ARROJADO();
        RealizadorDeInvestimentos realInvest = new RealizadorDeInvestimentos();
        realInvest.realizaInvestimento(conta, novoInvestimento);
	}

}
