package br.com.aguiardafa.estudo.designpatterns2.bridge;

public class TestesManuais implements Tarefa {
	 
    @Override
    public void realiza() {
        System.out.println("constr�i testes manuais");
    }
 
}