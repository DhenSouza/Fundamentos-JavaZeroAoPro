package fundamentosJava.ArraysCollections.Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Leal");
		usuarios.put(3, "Waguiner");
		usuarios.put(4, "Bachiello");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		
		System.out.println(usuarios.containsKey(3));
		System.out.println(usuarios.containsValue("Bachiello"));
		
		System.out.println(usuarios.get(3));
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + "==>");
			System.out.println(registro.getValue());
		}
		
		
	}

}
