package fundamentosJava.lambda;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {

		// Interface que aceita um parametro de um tipo e retorna algo do mesmo Tipo.
		UnaryOperator<Integer> maisDois = num -> num + 2;
		UnaryOperator<Integer> vezesDois = num -> num * 2;
		UnaryOperator<Integer> aoQuadrado = num -> num * num;

		// segue a ordem da composição chamando em ordem crescente
		Integer primeiroTest = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
		System.out.println(primeiroTest);
		
		// Segue a ordem inversa e chama de forma decrescente
		Integer segundoTest = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);
		System.out.println(segundoTest);

	}

}
