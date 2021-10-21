package fundamentosJava.lambda;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {

		// Recebe um argumento e retorna um valor booleano
		Predicate<Produto> itExpensive = prod -> (prod.getPreco() * (1 - prod.getDesconto())) >= 2500;

		Produto product = new Produto("Notbook", 3468.88, 0.10);

		System.out.println(itExpensive.test(product));

	}

}
