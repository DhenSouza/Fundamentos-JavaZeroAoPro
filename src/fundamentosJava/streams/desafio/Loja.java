package fundamentosJava.streams.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import fundamentosJava.streams.Map;

public class Loja {
	
	public static void main(String[] args) {
		Produto prod1 = new Produto(1, "PS5", 5000., 0.30);
		Produto prod2 = new Produto(1, "XBOX", 3000., 0.25);
		Produto prod3 = new Produto(1, "PC", 15000., 0.50);
		Produto prod4 = new Produto(1, "SWITCH", 7000., 0.50);
		
		List<Produto> produtos = Arrays.asList(prod1, prod2, prod3, prod4);
		
		Predicate<Produto> saberDesconto = p -> p.getPreco() >= 5000;
		Predicate<Produto> descontoMaiorTrinta = p -> p.getDesconto() >= 0.30;
		Predicate<Produto> produtoVitrine = p -> p.getPreco() >= 3000 && p.getPreco() <= 5000;
		
		Predicate<Produto> porTamanhoString = p -> p.getNome().length() == 2;
		
		Function<Produto, Double> precoComDesconto = prod -> 
		(prod.getPreco() * (1 - prod.getDesconto()));
		
		Function<Produto, String> mostraProduto = prod -> prod.toString();
		
		
		produtos.stream()
		.filter(saberDesconto)
		.filter(descontoMaiorTrinta)
		.filter(produtoVitrine)
		.map(mostraProduto)
		.forEach(System.out::println);
	}

}
