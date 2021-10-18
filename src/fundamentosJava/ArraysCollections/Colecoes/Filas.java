package fundamentosJava.ArraysCollections.Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Filas {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();

		/*
		 * Offer e ADD: adicionam elementos na fila a diferen�a, � o comportamento
		 * quando a fila esta cheia!
		 */
		fila.add("Denilson");
		fila.offer("Daniel");
		fila.add("Guilherme");
		fila.offer("Carlos");
		fila.add("Rafaela");
		fila.offer("Jo�p");
		
		// Peek retorna NULL E
		// Obtem o elemento da fila sem remover a mesma.
		//Element lan�a excess�o se estiverem vazias.
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		for(String filinha: fila) {
			System.out.println(filinha);
		}
		
		// retorna a primeira poci��o e remove da lista depois
		System.out.println(fila.poll()); // retorna falso quando a lista esta vazia
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.remove()); // retorna uma excess�o quando a fila esta vazia

	}

}
