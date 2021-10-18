package fundamentosJava.ArraysCollections.Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		// adiciona na pilha e retorna um booleano se for verdadeiro ou falço
		livros.add("O pequeno marginal"); 
		// adiciona na fila ele retorna uma excessão caso nao consiga por questao de limite de tamanho
		livros.push("O melhor do melhor");
		livros.push("Senhor dos aneis");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.pop());
	}

}
