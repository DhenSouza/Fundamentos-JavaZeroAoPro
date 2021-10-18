package fundamentosJava.EstruturaControle.DesafiosControle;

import java.util.Scanner;

public class DesafioReceberPositivosNegativos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		/*
		 * Criar um programa que enquanto estiver recebendo números positivos, imprime
		 * no console a soma dos números inseridos, caso receba um número negativo,
		 * encerre o programa. Tente utilizar a estrutura do while.
		 */

		Integer numero = 0;
		Integer soma = 0;
		do {
			System.out.println("Informe um numero: ");
			numero = scan.nextInt();
			
			if(numero > 0) {
				soma += numero;
			}

		} while (numero >= 0);

		System.out.println("Soma dos numeros positivos: " + soma);
		System.out.println("Fim do programa!");
		scan.close();
	}
}
