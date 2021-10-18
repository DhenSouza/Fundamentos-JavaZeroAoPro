package fundamentosJava.oo.composicao.desafios;

public class Item {
	
	Integer idItem;
	Integer qtdItems;
	
	Compra compra;
	Produto produto;

	public Item() {
	}

	public Item(Integer idItem, Integer qtdItems, Produto produto) {
		this.idItem = idItem;
		this.qtdItems = qtdItems;
		this.produto = produto;
	}
	

	@Override
	public String toString() {
		return "Item [idItem=" + idItem + ", qtdItems=" + qtdItems + ", produto=" + produto
				+ "]";
	}

	
}
