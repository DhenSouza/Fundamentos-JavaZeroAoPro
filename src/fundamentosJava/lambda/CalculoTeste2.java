package fundamentosJava.lambda;

public class CalculoTeste2 {

	public static void main(String[] args) {

		// Express�o Lambda
		Calculo calculo = (x, y) -> {
			return x + y;
		};

		System.out.println(calculo.executar(2, 3));

		// Quando tira o par de chaves ele associa que � o return, 
		// mas nao pode mais nenhuma senten�a de codigo
		calculo = (x, y) -> x * y;
		System.out.println(calculo.executar(10.78,10.43));
	}

}
