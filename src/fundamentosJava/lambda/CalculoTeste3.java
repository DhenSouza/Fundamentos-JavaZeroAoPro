package fundamentosJava.lambda;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		// Interface do java.util.function que retorna um valor do mesmo TIPO
		BinaryOperator<Double> calculo = (x, y) -> {
			return x + y;
		};

		System.out.println(calculo.apply(2., 3.)); 
		
		calculo = (x,y) -> x * y;
		
		System.out.println(calculo.apply(2., 3.));


	}

}
