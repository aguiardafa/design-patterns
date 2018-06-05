package br.com.aguiardafa.estudo.designpatterns2.flyweigth;

import java.util.HashMap;
import java.util.Map;

public class NotasMusicaisFlyweigth {
	// semelhante uma factory, esta classe instanciará Notas musicais
	// porém, para cada tipo de Nota ela instaciará somento um objeto
	// e sempre qye alguém pedir, ela devolverá o mesmo objeto
	private static Map<String, Nota> notas = new HashMap<String, Nota>();

	//ou seja, uma fábrica, que tem um Mapa, que guarda uma instancia de cada Nota
	static {
		notas.put("do", new Do());
		notas.put("re", new Re());
		notas.put("mi", new Mi());
		notas.put("fa", new Fa());
		notas.put("sol", new Sol());
		notas.put("la", new La());
		notas.put("si", new Si());
	}

	public Nota getNota(String nome) {
		return notas.get(nome);
	}
}
