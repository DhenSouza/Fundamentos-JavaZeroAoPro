package fundamentosJava.streams.desafio;

public class Produto {

	private Integer id;
	private String nome;
	private Double preco;
	private Double desconto;

	public Produto() {
		super();
	}

	public Produto(Integer id, String nome, Double preco, Double desconto) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + ", desconto=" + desconto + "]";
	}

}
