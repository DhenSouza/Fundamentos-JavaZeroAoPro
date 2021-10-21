package fundamentosJava.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {

		// Recee um tipo e não retorna nada.
		Consumer<Produto> print = prod -> System.out.println(prod);

		Produto product = new Produto("Lapis", 12.90, 0.09);

		// se tratando de apenas um Produto, chamando o accept executa a instrução do
		// consumer
		print.accept(product);

		Produto product2 = new Produto("Borracha", 3.90, 0.09);
		Produto product3 = new Produto("Caderno", 24.90, 0.19);
		Produto product4 = new Produto("Giboia", 4.90, 0.09);
		List<Produto> products = Arrays.asList(product, product2, product3, product4);

		// Precisa de um consumer pois nao retorna nenhum valor, somente as instruções
		products.forEach(print);

		// Posso fazer manualmente
		products.forEach(p -> System.out.println(p.getPreco()));
		
		products.forEach(System.out::println);
	}

}
