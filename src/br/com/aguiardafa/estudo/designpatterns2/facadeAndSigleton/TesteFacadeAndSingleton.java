package br.com.aguiardafa.estudo.designpatterns2.facadeAndSigleton;

public class TesteFacadeAndSingleton {
	public static void main(String[] args) {
		// sem o uso de Padrões, utilizando os serviços aleatoriamente
		String cpf = "123.456.789-00";
		Cliente cliente = new ClienteDao().buscaPorCpf(cpf);
		Double valor = 1000.00;
		Fatura fatura = new Fatura(cliente, valor);
		Cobranca cobranca = new Cobranca(Tipo.BOLETO, fatura);
		cobranca.emite();
		ContatoCliente contato = new ContatoCliente(cliente, cobranca);
		contato.disparaEmail();

		// utilizando o padrao FACADE - onde temos uma classe com todos os serviços
		EmpresaFacade facade = new EmpresaFacade();

		Cliente cliente2 = facade.buscaCliente(cpf);
		Fatura fatura2 = facade.criaFatura(cliente2, 500.0);
		Cobranca cobranca2 = facade.geraCobranca(fatura2);
		facade.fazerContato(cliente, cobranca2);
		// ...

		// utilizando o padrao SIGLETON - acessando o Facade pelo Sigleton
		// desta forma garantimos que a instancia será unica
		EmpresaFacade facadeSigleton = new EmpresaFacadeSigleton().getInstancia();

		Cliente cliente3 = facadeSigleton.buscaCliente(cpf);
		Fatura fatura3 = facadeSigleton.criaFatura(cliente3, 500.0);
		facadeSigleton.geraCobranca(fatura3);
		// ...

	}
}
