package fundamentosJava.excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {

			System.out.println(7/scan.nextInt());

			scan.close();
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("Finalmente... ");
		}
	}

}
