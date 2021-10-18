package fundamentosJava.oo.composicao.desafios;

public class Produto {

	Integer idProduto;
	String nome;
	Double preco;

	public Produto() {
	}

	public Produto(Integer idProduto, String nome, Double preco) {
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return " Codigo Produto " + idProduto + ", nome do Produto " + nome + ", preco " + preco;
	}

}
