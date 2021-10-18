package fundamentosJava.EstruturaControle.DesafiosControle;

import java.util.Scanner;

public class DesafioMedia {

	public static void main(String[] args) {
		/*
		 * calcular media de notas
		 * 
		 * não sabe quantos alunos tem while
		 * 
		 * digitar nota de >= 0 ou <=10
		 * 
		 * armazenar valor da nota em uma variavel total e acrecentar
		 * 
		 * variavel para ver quantas naotas valiudas foram digitadas
		 */

		Scanner scan = new Scanner(System.in);

		Double nota = 0.0;
		Integer cont = 0;
		double total = 0.;

		while (nota != -1) {
			
			System.out.println("Informe uma nota de 0 a 10 para finalizar digite -1: ");
			nota = scan.nextDouble();
			
			if (nota >= 0. && nota <= 10.) {
				total += nota;
				cont++;
			} else if(nota != -1){
				System.out.println("Digite um valor valido entre 0 e 10");
			}
		}

		Double media = total / cont;
		System.out.println("A media das notas é de: " + media);
		scan.close();
	}

}
