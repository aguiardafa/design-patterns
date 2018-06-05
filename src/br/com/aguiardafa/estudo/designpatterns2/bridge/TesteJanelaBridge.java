package br.com.aguiardafa.estudo.designpatterns2.bridge;

public class TesteJanelaBridge {
	public static void main(String[] args) {
		
		//"Desacoplar uma abstra��o da sua implementa��o,
		// de modo que as duas possam variar independentemente.�
		JanelaAbstrata janela = new JanelaDialogo(new JanelaWindows());
		janela.desenhar();
		janela = new JanelaAviso(new JanelaWindows());
		janela.desenhar();

		janela = new JanelaDialogo(new JanelaLinux());
		janela.desenhar();
	}
}
