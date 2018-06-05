package br.com.aguiardafa.estudo.designpatterns2.facadeAndSigleton;

public class EmpresaFacade {

	// construtor protected por conta do uso do padrao SIGLETON
	protected EmpresaFacade() {
	}

	// classe de FACHADA
	// onde estarão centralizados todos os serviços que o sistema quer oferecer
	public Cliente buscaCliente(String cpf) {
		Cliente cliente = new ClienteDao().buscaPorCpf(cpf);
		return cliente;
	}

	public Fatura criaFatura(Cliente cliente, Double valor) {
		Fatura fatura = new Fatura(cliente, valor);
		return fatura;
	}

	public Cobranca geraCobranca(Fatura fatura) {
		Cobranca cobranca = new Cobranca(Tipo.BOLETO, fatura);
		cobranca.emite();

		return cobranca;
	}

	public ContatoCliente fazerContato(Cliente cliente, Cobranca cobranca) {
		ContatoCliente contatoCliente = new ContatoCliente(cliente, cobranca);
		contatoCliente.disparaEmail();

		return contatoCliente;
	}

}
