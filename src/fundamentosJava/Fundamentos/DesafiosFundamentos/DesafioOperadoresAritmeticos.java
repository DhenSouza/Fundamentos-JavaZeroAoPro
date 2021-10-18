package fundamentosJava.Fundamentos.DesafiosFundamentos;

public class DesafioOperadoresAritmeticos {

	public static void main(String[] args) {

		System.out.println("---Resolução de um calculo qualquer---");

		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;

		double numB = (1 - 5) * (2 - 7);
		double denB = 2;

		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);

		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);

		double resultadoFinal = superior / inferior;

		System.out.println("Resultado primeira: " + superiorA);
		System.out.println("----------------------");
		System.out.println("Resultado Segunda: " + superiorB);
		System.out.println("----------------------");
		System.out.println("Resultado Superior: " + superior);
		System.out.println("----------------------");
		System.out.println("Resultado final: " + resultadoFinal);

	}

}
