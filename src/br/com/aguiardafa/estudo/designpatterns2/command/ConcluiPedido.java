package br.com.aguiardafa.estudo.designpatterns2.command;

/** O Command para Concluir Pedido - ConcreteCommand #2 */
public class ConcluiPedido implements Comando {

	private Pedido pedido;

	public ConcluiPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override // Command
	public void executa() {
		System.out.println("Concluindo pedido do " + pedido.getCliente());
		pedido.finaliza();
	}

}
