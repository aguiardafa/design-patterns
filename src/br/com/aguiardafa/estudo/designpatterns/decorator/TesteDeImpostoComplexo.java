package br.com.aguiardafa.estudo.designpatterns.decorator;

import br.com.aguiardafa.estudo.designpatterns.strategy.ICCC;
import br.com.aguiardafa.estudo.designpatterns.strategy.ISS;
import br.com.aguiardafa.estudo.designpatterns.strategy.Imposto;
import br.com.aguiardafa.estudo.designpatterns.strategy.Orcamento;
import br.com.aguiardafa.estudo.designpatterns.templatemethod.ICPP;

public class TesteDeImpostoComplexo {

	public static void main(String[] args) {
		Imposto imposto = new ICCC(new ISS(new ImpostoMuitoAlto(new ICPP())));
		
		Orcamento orcamento = new Orcamento(500.0);
        
        double valor = imposto.calcula(orcamento);
        
        System.out.println(valor);
	}

}
