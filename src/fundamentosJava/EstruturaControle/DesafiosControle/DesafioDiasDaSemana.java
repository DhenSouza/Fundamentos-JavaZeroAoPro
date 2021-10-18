package fundamentosJava.EstruturaControle.DesafiosControle;

import java.util.Scanner;

public class DesafioDiasDaSemana {

	public static void main(String[] args) {
		// digitar domingo e retorna 1
		// quarta retorna 4
		// terça retorna 3 etc

		Scanner scan = new Scanner(System.in);
		boolean validacao = true;

		while (validacao) {
			System.out.println("Informe o dia da semana: ");
			String dia = scan.nextLine();

			if (dia.equalsIgnoreCase("Domingo")) {
				System.out.println(1);
				validacao = false;
			} else if(dia.equalsIgnoreCase("Segunda")){
				System.out.println(2);
				validacao = false;
			}  else if(dia.equalsIgnoreCase("Terca")){
				System.out.println(3);
				validacao = false;
			}  else if(dia.equalsIgnoreCase("Quarta")){
				System.out.println(4);
				validacao = false;
			}  else if(dia.equalsIgnoreCase("Quinta")){
				System.out.println(5);
				validacao = false;
			}  else if(dia.equalsIgnoreCase("Sexta")){
				System.out.println(6);
				validacao = false;
			}  else if(dia.equalsIgnoreCase("Sabado")){
				System.out.println(7);
				validacao = false;
			} else {
				System.out.println("Dia da semana errado, tente novamente!");
			}
		}

		System.out.println("Fim do desafio");
	}

}
