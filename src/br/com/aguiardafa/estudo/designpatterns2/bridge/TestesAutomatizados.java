package br.com.aguiardafa.estudo.designpatterns2.bridge;

public class TestesAutomatizados implements Tarefa {
	 
    @Override
    public void realiza() {
        System.out.println("constrói testes automatizados");
    }
 
}