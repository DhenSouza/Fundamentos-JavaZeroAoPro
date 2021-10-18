package fundamentosJava.Fundamentos;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Qual a sua idade?");
		int idade = scan.nextInt();
		scan.nextLine();

		System.out.println("Qual o seu nome?");
		String nome = scan.nextLine();

		System.out.println("Qual o seu sobrenome?");
		String sobrenome = scan.nextLine();

		scan.close();
	}
}
