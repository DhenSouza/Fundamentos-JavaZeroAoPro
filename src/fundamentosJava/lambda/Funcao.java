package fundamentosJava.lambda;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		// Ele espera um Tipo e pode retornar um outro Tipo
		Function<Integer, String> parOrImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";
		System.out.println(parOrImpar.apply(44));

		// Uma função lambda para retornar uma string
		Function<String, String> resultado = valor -> "O resultado é " + valor;

		Function<String, String> empolgado = valor -> valor + "!!!";
		
		Function<String, String> duvida = valor -> valor + "???";

		// usando o andThen ele primeiro chama a função RESULTADO e depois aplica na
		// função parORImpar
		// Chamando o segundo andThen ele chama uma outra função.
		String resultadoFinal1 = parOrImpar.andThen(resultado).andThen(empolgado).apply(53465);
		System.out.println(resultado.apply(resultadoFinal1));
		
		String resultadoFinal2 = parOrImpar.andThen(resultado).andThen(duvida).apply(53464);
		System.out.println(resultado.apply(resultadoFinal2));

	}

}
