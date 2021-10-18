package fundamentosJava.EstruturaControle;

import java.util.Scanner;

public class TestandoDoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String resposta = "Sair";
		do {
			System.out.println("Informe as palavars magicas");
			resposta = scan.nextLine();
		} while (!resposta.equalsIgnoreCase("Sair"));

		scan.close();
	}

}
