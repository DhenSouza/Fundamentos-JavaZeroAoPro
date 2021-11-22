package fundamentosJava.generics;

public class ParesTeste {

	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Maria");
		resultadoConcurso.adicionar(2, "Pedro");
		resultadoConcurso.adicionar(3, "Jose");
		resultadoConcurso.adicionar(4, "Lucas");
		resultadoConcurso.adicionar(2, "Vigario");
		
		System.out.println(resultadoConcurso.getValor(2));
		System.out.println(resultadoConcurso.getValor(4));
		System.out.println(resultadoConcurso.getValor(1));

	}

}
