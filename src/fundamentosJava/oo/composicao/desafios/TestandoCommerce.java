package fundamentosJava.oo.composicao.desafios;

import java.util.Scanner;

public class TestandoCommerce {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		

		Cliente cliente1 = new Cliente(1, "Denilson", "deni@ragnar.com");
		
		Compra primeiraCompra = new Compra();
		
/*		Produto produto1 = new Produto(1, "PS5", 6000.00);
		Produto produto2 = new Produto(1, "XBOX", 3000.00);
		Produto produto3 = new Produto(1, "PC GAMER", 20000.00);*/
		
		Item item1 = new Item(1, 2, new Produto(1, "PS5", 6000.00));
		Item item2 = new Item(2, 1, new Produto(2, "XBOX", 3000.00));
		Item item3 = new Item(3, 0, new Produto(3, "PC GAMER", 20000.00));
		
		primeiraCompra.adiciona(item1);
		primeiraCompra.adiciona(item2);
		
		
		cliente1.adiciona(primeiraCompra);
		
		Double valorTotal = cliente1.obterValorTotal(primeiraCompra);
		
		System.out.println("O cliente " + cliente1 + " Fez aquisições dos seguintes produtos: ");
		for(Item c: primeiraCompra.itens) {
			System.out.print("Quantidade: " + c.qtdItems + " ");
			System.out.println(" " + c.produto);
		}
		System.out.printf("\nO valor total dos produtos comprados pelo cliente %s é de: %.2f",
				cliente1.nome, valorTotal);
		
		
	}
	
}
