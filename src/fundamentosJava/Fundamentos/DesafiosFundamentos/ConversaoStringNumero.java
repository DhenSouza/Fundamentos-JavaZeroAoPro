package fundamentosJava.Fundamentos.DesafiosFundamentos;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro n�mero");

		String valor2 = JOptionPane.showInputDialog("Digite o segundo n�mero");

		System.out.println(valor1 + valor2);

		Double numero1 = Double.parseDouble(valor1);
		Double numero2 = Double.parseDouble(valor2);

		double soma = numero1 + numero2;

		double media = soma / 2;

		System.out.println("Soma �: " + soma);
		System.out.println("Media da soma �: " + media);

		/*
		 * BigDecimal bigSoma = new BigDecimal(soma); BigDecimal bigMedia = new
		 * BigDecimal(media);
		 * 
		 * System.out.println("BigSoma �: " + bigSoma);
		 * System.out.println("BigMedia da soma �: " + bigMedia);
		 */
	}
}
