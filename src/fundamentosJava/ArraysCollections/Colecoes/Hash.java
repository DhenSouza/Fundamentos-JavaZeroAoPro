package fundamentosJava.ArraysCollections.Colecoes;

import java.util.HashSet;

import fundamentosJava.ArraysCollections.Usuario;

public class Hash {

	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<>();
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Guilbert"));
		
		boolean resultado = usuarios.contains(new Usuario("Guilbert"));
		System.out.println(resultado);

	}

}
