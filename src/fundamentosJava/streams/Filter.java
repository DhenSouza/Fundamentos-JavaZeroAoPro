package fundamentosJava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Daniela", 7.8);
		Aluno aluno2 = new Aluno("Denilson", 5.8);
		Aluno aluno3 = new Aluno("Jiane", 9.8);
		Aluno aluno4 = new Aluno("Luna", 6.8);
		Aluno aluno5 = new Aluno("Eliz", 7.1);
		Aluno aluno6 = new Aluno("Maicu", 8.8);

		List<Aluno> listaAlunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6);
		
		Predicate<Aluno> aprovado = a -> a.getNota() >= 7.;
		Function<Aluno, String> sudacaoAprovado = a -> "Parabens " + a.getNome() + "! voce foi aprovada!";
		
		listaAlunos.stream()
		.filter(aprovado)
		.map(sudacaoAprovado)
		.forEach(System.out::println);
		
		

	}

}
