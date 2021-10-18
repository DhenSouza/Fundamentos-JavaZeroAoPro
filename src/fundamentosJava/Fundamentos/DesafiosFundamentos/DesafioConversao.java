package fundamentosJava.Fundamentos.DesafiosFundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String salario1 = "";
		String salario2 = "";
		String salario3 = "";

		int cont = 0;
		for (int i = 0; i < 3; i++) {
			String provisorio = JOptionPane.showInputDialog("Digite o " + (i+1) + "º número").replace(",", ".");

			if (i == 0) {
				salario1 = provisorio;
			} else if (i == 1) {
				salario2 = provisorio;
			} else {
				salario3 = provisorio;
			}
			cont++;
		}

		Double numero1 = Double.parseDouble(salario1);
		Double numero2 = Double.parseDouble(salario2);
		Double numero3 = Double.parseDouble(salario3);

		double media = (numero1 + numero2 + numero3) / cont;

		System.out.println("A media salarial desse funcionario é de: " + media);

		scan.close();
	}

}
