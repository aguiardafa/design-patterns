package br.com.aguiardafa.estudo.designpatterns.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.aguiardafa.estudo.designpatterns.state.EmAprovacao;
import br.com.aguiardafa.estudo.designpatterns.state.EstadoDeUmOrcamento;

public class Orcamento {
	public double valor; //certo seria usar protected e manter as Classes do estado no mesmo pacote
	public EstadoDeUmOrcamento estadoAtual; // veja a mudança aqui

	private final List<Item> itens;

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<>();
		this.estadoAtual = new EmAprovacao();
	}

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}

	public void aprova() {
		estadoAtual.aprova(this);
	}

	public void reprova() {
		estadoAtual.reprova(this);
	}

	public void finaliza() {
		estadoAtual.finaliza(this);
	}

	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void adicionaItem(Item item) {
		itens.add(item);
	}

	public boolean existeItem(String nomeDoItem) {
		for (Item item : this.getItens()) {
			if (item.getNome().equals(nomeDoItem))
				return true;
		}
		return false;
	}

	public boolean temItemMaiorQue100Reais() {
		for (Item item : this.getItens()) {
			if (item.getValor() > 100)
				return true;
		}
		return false;
	}

	public boolean existeItemComMesmoNome() {
		List<String> itensNoOrcamento = new ArrayList<String>();

		for (Item item : this.getItens()) {
			if (itensNoOrcamento.contains(item.getNome()))
				return true;
			else
				itensNoOrcamento.add(item.getNome());
		}
		return false;
	}
}
