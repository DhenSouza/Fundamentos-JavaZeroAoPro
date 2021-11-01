package fundamentosJava.lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;


public class Desafio {

	public static void main(String[] args) {
		/**
		 * 1. a PARTIR DO PRODUO CALCULAR O PRECO TOTAL (Com desconto); 
		 * 2. Imposto Municipal: >= 2500 (8,5%) / < 2500 (Isento)
		 * 3. Frete: >= 3000 (100) / 3000(50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$1234,56
		 **/


		Function<Produto2, Double> precoComDesconto = prod -> 
		(prod.getPreco() * (1 - prod.getDesconto()));
		
		
		UnaryOperator<Double> impostoMunicipal = prod -> prod >= 2500 ? prod * 1.085 : prod;
		UnaryOperator<Double> frete = prod -> prod >= 3000 ? prod + 100 : prod + 50;
		UnaryOperator<Double> arredondar = prod -> Double.parseDouble(String.format("%.2f", prod));
		Function<Double, String> formatacao = preco -> ("R$" + preco).replace(".", ",");
		
		
		Produto2 produto1 = new Produto2("XBOX", 3235.80, 0.50);
		
		String resultadoFinal = precoComDesconto
				.andThen(impostoMunicipal)
				.andThen(frete)
//				.andThen(arredondar)
				.andThen(formatacao)
				.apply(produto1);
		
		System.out.println("Valor final é: " + resultadoFinal);

	}

}
