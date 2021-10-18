package fundamentosJava.ArraysCollections.Arrays;

import java.util.Scanner;

public class MediaDeNotas {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Double soma = 0.;

		System.out.println("Quantas notas voce deseja informar?");
		Integer qtdNotas = scan.nextInt();
		Double[] notas = new Double[qtdNotas];

		armazenaNotas(notas);

		for (Double n : notas) {
			if (notas != null) {
				soma += n;
			}
		}

		System.out.printf("A media das notas computadorizadas é de : %.f", mediaDasNotas(soma, notas.length));
	}

	public static Double[] armazenaNotas(Double... notas) {
		System.out.println("Informe as notas desejadas: ");
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a " + (i + 1) + "º nota: ");
			Double notasDigitadas = scan.nextDouble();

			if (notasDigitadas != null) {
				notas[i] = notasDigitadas;
			}
		}

		return notas;
	}

	public static Double mediaDasNotas(Double soma, Integer cont) {
		return soma / cont;
	}

}
