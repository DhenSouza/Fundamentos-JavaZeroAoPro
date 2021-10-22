package fundamentosJava.lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {

		// Interface que recebe dois parametros do mesmo tipo e retorna um do mesmo
		// tipo.
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(9.8, 5.7));

		// Interface que recebe dois argumentos de qualquer tipo e retorna um resultado
		// de qualquer tipo
		BiFunction<Double, Double, String> resultado = (n1, n2) -> {
			double notaFinal = ((n1 + n2) / 2);
			return notaFinal > 7. ? "Aprovado" : "Reprovado";
		};
		
		System.out.println(resultado.apply(9.8, 5.7));

		// Usando uma outra forma de composição

		System.out.println(outraForma(9.8, 5.7));
	}

	public static String outraForma(Double n1, Double n2) {

		BinaryOperator<Double> media = (numero1, numero2) -> (numero1 + numero2) / 2;
		Function<Double, String> status = num -> num > 6. && num <= 10 ? "Aprovado" : "Reprovado";

		String resultado = media.andThen(status).apply(n1, n2);

		return resultado;
	}

}
