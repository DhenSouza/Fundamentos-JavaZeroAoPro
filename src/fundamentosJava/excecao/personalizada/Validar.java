package fundamentosJava.excecao.personalizada;

import fundamentosJava.excecao.Aluno;

public class Validar {
	
	private Validar() {}
	
	public static void Aluno(Aluno aluno) {
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno esta Nulo!");
		}
		
		if(aluno.getNome() == null || aluno.getNome().trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}
		
		if(aluno.getNota() < 0 || aluno.getNota() > 10) {
			throw new NumeroForaIntervaloException("nota");
		}
		
	}

}
