package fundamentosJava.oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");

		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2023");
		Curso curso3 = new Curso("React Native");

		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);

		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);

		aluno1.adicionarAluno(curso3);
		aluno2.adicionarAluno(curso3);
		aluno3.adicionarAluno(curso3);

		for (Aluno a : curso2.alunos) {
			System.out.println("Estou matriculado no curso " + curso2.nome + " ...");
			System.out.println("E meu nome é: " + a.nome);
		}

		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java completo");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}

}
