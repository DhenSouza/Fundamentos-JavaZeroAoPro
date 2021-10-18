package fundamentosJava.ClassesEMetodos.DesafiosClassesMetodos;

public class TesteProduto {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook Preto", 4356.89);
		
		Produto p2 = new Produto("Caneta Azul", 12.56);
		
		Produto.desconto = 0.29;
		
		System.out.println(p1.nomeProduto + " " + p1.descontosProduto());
		System.out.println(p2.nomeProduto + " " + p2.descontosProduto());
		
		double precoProdutoFinal1 = p1.descontosProduto();
		double precoProdutoFinal2 = p2.descontosProduto(0.1);
		double mediaCarrinho = (precoProdutoFinal1 + precoProdutoFinal2) / 2;
		
		System.out.printf("Media do Carrinho é de R$%.2f" , mediaCarrinho);

	}

}
