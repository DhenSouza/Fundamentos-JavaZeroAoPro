package fundamentosJava.lambda;

public class Produto {

	private final String nome;
	private final Double preco;
	private final Double desconto;

	public Produto(String nome, Double preco, Double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	public Double getDesconto() {
		return desconto;
	}

	@Override
	public String toString() {
		return "nome= " + nome + ", preco= " + preco + ", desconto= " + desconto;
	}

}
