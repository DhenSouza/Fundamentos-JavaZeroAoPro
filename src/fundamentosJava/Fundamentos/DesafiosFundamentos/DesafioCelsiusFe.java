package fundamentosJava.Fundamentos.DesafiosFundamentos;

import java.util.Scanner;

public class DesafioCelsiusFe {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 double f = 37;
		
		System.out.println("Informe a temperatura em celsius");
		double celsius  = scan.nextDouble();
		
		
		f = ((celsius * 1.8) +32);
		
		System.out.println("resultado" + f);
		
	}

}
