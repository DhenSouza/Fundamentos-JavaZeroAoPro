package fundamentosJava.lambda;

public class Produto2 {

	private String nome;
	private Double preco;
	private Double desconto;

	public Produto2(String nome, Double preco, Double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	@Override
	public String toString() {
		return "nome= " + nome + ", preco= " + preco + ", desconto= " + desconto;
	}

}
