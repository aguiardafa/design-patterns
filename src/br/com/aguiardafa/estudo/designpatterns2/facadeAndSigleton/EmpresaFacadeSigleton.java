package br.com.aguiardafa.estudo.designpatterns2.facadeAndSigleton;

public class EmpresaFacadeSigleton {
	private static EmpresaFacade instancia;

	public static synchronized EmpresaFacade getInstancia() {
		if (instancia != null) {
			instancia = new EmpresaFacade();
		}

		return instancia;
	}
}
