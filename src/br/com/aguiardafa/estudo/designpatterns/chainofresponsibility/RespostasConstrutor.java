package br.com.aguiardafa.estudo.designpatterns.chainofresponsibility;

public class RespostasConstrutor {
	public static Resposta buildResposta() {
		return new RespostaEmCsv(new RespostaEmPorcento(new RespostaEmXml()));
	}

}
