package fundamentosJava.ArraysCollections.Arrays;

import java.util.Scanner;

public class MatrizDaMediaNotasAlunos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		

		System.out.println("Informe quantos alunos tem na turma: ");
		Integer qtdAluno = scan.nextInt();

		System.out.println("Quantas notas esse aluno possui? ");
		Integer qtdNota = scan.nextInt();

		Double[][] notasEAlunos = new Double[qtdAluno][qtdNota];

		Double soma = 0.0;

		for (int i = 0; i < notasEAlunos.length; i++) {
			for (int j = 0; j < notasEAlunos[i].length; j++) {
				System.out.println("Informe a " + (j + 1) + "ª nota do aluno " + (i + 1) + ": ");
				notasEAlunos[i][j] = scan.nextDouble();
				soma += notasEAlunos[i][j];
			}
		}

		Double media = soma / (qtdAluno * qtdNota);

		System.out.printf("A media da turma é de %.2f ", media);

		scan.close();
	}

}
