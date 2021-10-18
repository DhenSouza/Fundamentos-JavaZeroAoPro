package fundamentosJava.EstruturaControle.DesafiosControle;

import java.util.Scanner;

public class DesafioWhileIndeterminado {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String resposta = "";
		
		while(!resposta.equalsIgnoreCase("Sair")) {
			System.out.println("Digite algo: ");
			 resposta = scan.nextLine();
		}
		
		System.out.println("Programa finalizado");
	}

}
