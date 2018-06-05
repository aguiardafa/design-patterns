package br.com.aguiardafa.estudo.designpatterns2.bridge;

public class ProgramacaoJava implements Tarefa {
	 
    @Override
    public void realiza() {
        System.out.println("cria muitas linhas de código Java");
    }
 
}