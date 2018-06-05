package br.com.aguiardafa.estudo.designpatterns2.command;

/** O Command para Pagar Pedido - ConcreteCommand #1 */
public class PagaPedido implements Comando {

	private Pedido pedido;

	public PagaPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override // Command
	public void executa() {
		System.out.println("Pagando pedido do " + pedido.getCliente());
		pedido.paga();
	}

}
