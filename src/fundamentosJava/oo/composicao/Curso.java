package fundamentosJava.oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	final String nome;
	final List<Aluno> alunos = new ArrayList<>();

	public Curso(String nome) {
		this.nome = nome;
	}

	void adicionarAluno(Aluno aluno) {
		if(this.alunos != null) {
			this.alunos.add(aluno);
			aluno.cursos.add(this);
		}
	}

	public String toString() {
		return nome;
	}

}
