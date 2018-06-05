package br.com.aguiardafa.estudo.designpatterns2.bridge;

public class JanelaAviso extends JanelaAbstrata {
	 
    public JanelaAviso(JanelaImplementada j) {
        super(j);
    }
 
    @Override
    public void desenhar() {
        desenharJanela("Janela de Aviso");
        desenharBotao("Ok");
    }
 
}