package fundamentosJava.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		System.out.println("Forma Tradicional ForEach");
		List<String> lista = Arrays.asList("Deni", "Yugi", "Uli", "Back");
		for (String nome : lista) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando Iterator...");
		Iterator<String> it = lista.iterator(); 
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\nUsando Stream...");
		Stream<String> st = lista.stream();
		st.forEach(System.out::println);
		
	}
}
