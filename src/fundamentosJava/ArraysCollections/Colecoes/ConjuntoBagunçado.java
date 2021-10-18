package fundamentosJava.ArraysCollections.Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBagun�ado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		conjunto.add(1.2); // converter do double -> Double
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');

		System.out.println("Tamanho �: " + conjunto.size());
		// Ignora quando repete
		conjunto.add("Teste");

		System.out.println("Tamanho �: " + conjunto.size());
		System.out.println("Ele ira remover por que existe o elemento, valor: " + conjunto.remove("Teste"));
		System.out.println("Ele n�o ira remover, pois nao existe o elemento, valor: " + conjunto.remove("teste"));
		System.out.println("Ele ira remover por que existe o elemento, valor: " + conjunto.remove('x'));

		System.out.println("Tamanho depois de remover elementos �: " + conjunto.size());

		System.out.println("Verifica se o objeto existe: " + conjunto.contains('x'));

		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);
		System.out.println(conjunto);

		// conjunto.addAll(nums); // uniao entre dois conjuntos
		conjunto.retainAll(nums); // reten o valor em comum das cole��o
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);

	}

}
