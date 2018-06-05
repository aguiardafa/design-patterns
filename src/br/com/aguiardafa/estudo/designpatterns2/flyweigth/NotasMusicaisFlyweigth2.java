package br.com.aguiardafa.estudo.designpatterns2.flyweigth;

import java.util.HashMap;
import java.util.Map;

public class NotasMusicaisFlyweigth2 {
	private static Map<String, Nota> notas = new HashMap<String, Nota>();

	public Nota getNota(String nota) {
		if (!notas.containsKey(nota)) {
			//esse l�gica possui um problema:
			//caso tenham v�rios tipos de nota 
			//esse SWITCH pode ficar enorme
			switch (nota) {
			case "do":
				notas.put("do", new Do());
				break;
			case "re":
				notas.put("re", new Re());
				break;
			case "mi":
				notas.put("mi", new Mi());
				break;
			case "fa":
				notas.put("fa", new Fa());
				break;
			case "sol":
				notas.put("sol", new Sol());
				break;
			case "la":
				notas.put("la", new La());
				break;
			case "si":
				notas.put("si", new Si());
				break;
			default:
				throw new RuntimeException("Nota Musical n�o existe!!!");
			}
		}
		return notas.get(nota);
	}
}
