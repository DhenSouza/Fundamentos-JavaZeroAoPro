package fundamentosJava.lambda;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia");

		System.out.println("Forma Tradicional... ");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		System.out.println();

		System.out.println("Com Lambda #1... ");
		aprovados.forEach((nome) -> System.out.println(nome));

		System.out.println("Method reference #1...");
		aprovados.forEach(System.out::println);

		System.out.println("Com Lambda #2... ");
		aprovados.forEach((nome) -> myPrint(nome));

		System.out.println("Method reference #2...");
		aprovados.forEach(Foreach::myPrint);

	}

	public static void myPrint(String nome) {
		System.out.println("Meu nome é " + nome);
	}

}
