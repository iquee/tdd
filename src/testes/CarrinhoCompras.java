package testes;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
	
	private List<Produto> itens = new ArrayList<>();
	private List<ObservadorCarrinho> observadores = new ArrayList<>();
	
	public void adicionaProduto(Produto p){		
		itens.add(p);
		for (ObservadorCarrinho observador: observadores)
			observador.produtoAdicionado(p.getNome(), p.getValor());
	}
	
	public int total(){
		int total = 0;
		for (Produto produto : itens)
			total += produto.getValor();
		return total;
	}

	public void adicionarObservador(ObservadorCarrinho observador) {
		observadores.add(observador);
	}

}
