package fundamentosJava.ArraysCollections.Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		//Set<String> listaCandidatos = new HashSet<String>();
		SortedSet<String> listaCandidatos = new TreeSet<String>(); // ele garante ordenação ordena a lista

		listaCandidatos.add("Entidade 2");
		listaCandidatos.add("Entidade 4");
		listaCandidatos.add("Entidade 3");
		listaCandidatos.add("Entidade 5");
		listaCandidatos.add("Entidade 1");
		
		for(String s : listaCandidatos) {
			System.out.println(s);
		}

		Set<Integer> nums = new HashSet<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(369);
		nums.add(6);
		
		for(Integer numero : nums) {
			System.out.println(numero);
		}
		
	}

}
