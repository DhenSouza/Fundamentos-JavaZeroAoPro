package fundamentosJava.streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Gilbert", 10.);
		Aluno a2 = new Aluno("Jiranda", 7.1);
		Aluno a3 = new Aluno("Jiraya", 8.1);
		Aluno a4 = new Aluno("Gibson", 6.1);
		Aluno a5 = new Aluno("Gibson", 6.1);
		Aluno a6 = new Aluno("Leo", 6.1);
		Aluno a7 = new Aluno("Leo", 6.1);
		Aluno a8 = new Aluno("Carlos Bom de Guerra", 6.1);
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

		// Não repete elementos usando o equals e hashcode na classe aluno
		System.out.println("Distinct... ");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit... ");
		alunos.stream().distinct()
		.skip(2)
		.limit(2)
		.forEach(System.out::println);
		
		
//		Usado somente verssao Java 11... 
//		System.out.println("\ntakeWhile... ");
//		alunos.stream().distinct()
//		.takeWhile(a -> a.getNota() > 7)
//		.forEach(System.out::println);
	}

}
