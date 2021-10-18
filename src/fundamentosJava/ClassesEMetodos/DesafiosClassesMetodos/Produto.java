package fundamentosJava.ClassesEMetodos.DesafiosClassesMetodos;

public class Produto {
	
	public String nomeProduto;
	public Double valor;
	public static Double desconto = 0.25;
	
	public Produto() {
	}

	public Produto(String nomeProduto, Double valor) {
		this.nomeProduto = nomeProduto;
		this.valor = valor;
	}
	
	public Double descontosProduto() {
		return valor * (1 - desconto);
	}
	
	public Double descontosProduto(Double descontoPromocional) {
		return valor * (1 - desconto + descontoPromocional);
	}
	

}
