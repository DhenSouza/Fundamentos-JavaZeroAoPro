package fundamentosJava.oo.composicao.desafios;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Item> itens = new ArrayList<>();

	public Compra() {
	}
	
	void adiciona(Item item) {
		if(this.itens != null) {
			this.itens.add(item);
		}
	}

	Integer retornaItens() {
		Integer total = 0;
		for(Item i: itens) {
			total += i.qtdItems;
		}
		return total;
	}
	
	Double retornaValorItens() {
		Double total = 0.;
		for(Item i: itens) {
			total += i.qtdItems * i.produto.preco;
		}
		return total;
	}

	@Override
	public String toString() {
		return "items = " + itens + " ";
	}

}
