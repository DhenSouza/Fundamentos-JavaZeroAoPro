package fundamentosJava.EstruturaControle.DesafiosControle;

import java.util.Random;
import java.util.Scanner;

public class DesafioAdivinhacao {

	public static void main(String[] args) {
		/*
		 * Jogo da adivinhaÃ§Ã£o: Tentar adivinhar um nÃºmero entre 0 - 100. Armazene um
		 * numero aleatÃ³rio em uma variaÌ�vel. O Jogador tem 10 tentativas para adivinhar
		 * o nÃºmero gerado. Ao final de cada tentativa, imprima a quantidade de
		 * tentativas restantes, e imprima se o nÃºmero inserido eÌ� maior ou menor do que
		 * o nÃºmero armazenado.
		 */

		Scanner scan = new Scanner(System.in);
		Random gerador = new Random();

		Integer numero = gerador.nextInt(100);
		System.out.println(numero);
		Integer numeroFornecido;

		int cont = 0;
		for (int i = 10; i >= 0; i--) {
			System.out.println("Advinhe qual Ã© o numero de 0 A 100: ");
			numeroFornecido = scan.nextInt();

			if (numeroFornecido > numero) {
				System.out.println("Seu numero Ã© maior que o numero aleatorio.");
			} else if (numeroFornecido < numero) {
				System.out.println("Seu numero Ã© menor que o numero aleatorio.");
			} else {
				System.out.println("Parabens voce acertou o numero " + numero);
				break;
			}

			System.out.println("Tentativas restantes: " + (i - 1));
		}

		System.out.println("Game over.");
		scan.close();
	}

}
