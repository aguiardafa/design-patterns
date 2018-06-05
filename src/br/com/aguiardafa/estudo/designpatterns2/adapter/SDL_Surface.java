package br.com.aguiardafa.estudo.designpatterns2.adapter;

public class SDL_Surface {
	// suposta classe da API utilizada por um sistema
	// esta classes faz parte da API, assim não teriamos condições de alterá-la
	public void SDL_CarregarSurface(String arquivo) {
		System.out.println("Imagem " + arquivo + " carregada.");
	}

	public void SDL_DesenharSurface(int largura, int altura, int posicaoX, int posicaoY) {
		System.out.println("SDL_Surface desenhada");
	}

}