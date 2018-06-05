package br.com.aguiardafa.estudo.designpatterns2.adapter;

public interface ImagemTarget {
	// interface comum para o cliente
	void carregarImagem(String nomeDoArquivo);

	void desenharImagem(int posX, int posY, int largura, int altura);
}