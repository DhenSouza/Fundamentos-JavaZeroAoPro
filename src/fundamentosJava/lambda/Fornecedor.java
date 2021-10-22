package fundamentosJava.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		
		// Interface que recebe um parametro e nao retorna nada
		Supplier<List<String>> lista = () -> Arrays.asList("Ana", "Lia", "Gui"); 
		
		System.out.println(lista.get());

	}

}
