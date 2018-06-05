package br.com.aguiardafa.estudo.designpatterns2.flyweigth;

import java.util.Arrays;
import java.util.List;

public class TesteNotasMusicais {

	public static void main(String[] args) {
		NotasMusicaisFlyweigth3 notas = new NotasMusicaisFlyweigth3();
		
		List<Nota> musica = Arrays.asList(
				notas.getNota("do"),
				notas.getNota("re"),
				notas.getNota("mi"),
				notas.getNota("fa"),
				notas.getNota("fa"),
				notas.getNota("fa"),
				
				notas.getNota("do"),
				notas.getNota("re"),
				notas.getNota("do"),
				notas.getNota("re"),
				notas.getNota("re"),
				notas.getNota("re"),
				
				notas.getNota("do"),
				notas.getNota("sol"),
				notas.getNota("fa"),
				notas.getNota("mi"),
				notas.getNota("mi"),
				notas.getNota("mi"),
				
				notas.getNota("do"),
				notas.getNota("re"),
				notas.getNota("mi"),
				notas.getNota("fa"),
				notas.getNota("fa"),
				notas.getNota("fa"));
		
		Piano piano = new Piano();
		piano.toca(musica);
	}

}
