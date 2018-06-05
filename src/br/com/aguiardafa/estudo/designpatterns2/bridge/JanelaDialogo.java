package br.com.aguiardafa.estudo.designpatterns2.bridge;

public class JanelaDialogo extends JanelaAbstrata {
	 
    public JanelaDialogo(JanelaImplementada j) {
        super(j);
    }
 
    @Override
    public void desenhar() {
        desenharJanela("Janela de Diálogo");
        desenharBotao("Botão Sim");
        desenharBotao("Botão Não");
        desenharBotao("Botão Cancelar");
    }
 
}