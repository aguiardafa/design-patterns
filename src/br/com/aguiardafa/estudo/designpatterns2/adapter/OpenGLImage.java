package br.com.aguiardafa.estudo.designpatterns2.adapter;

public class OpenGLImage {
	// suposta classe da API utilizada por um sistema
	// esta classes faz parte da API, assim não teriamos condições de alterá-la
    public void glCarregarImagem(String arquivo) {
        System.out.println("Imagem " + arquivo + " carregada.");
    }
 
    public void glDesenharImagem(int posicaoX, int posicaoY) {
        System.out.println("OpenGL Image desenhada");
    }
}