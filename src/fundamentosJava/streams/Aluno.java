package fundamentosJava.streams;

public class Aluno {

	private final String nome;
	private final Double nota;
	private final Boolean bomComportamento;

	public Aluno(String nome, Double nota) {
		this(nome, nota, true);
	}

	public Aluno(String nome, Double nota, Boolean bomComportamento) {
		this.nome = nome;
		this.nota = nota;
		this.bomComportamento = bomComportamento;
	}

	public String getNome() {
		return nome;
	}

	public Double getNota() {
		return nota;
	}

	public Boolean getBomComportamento() {
		return bomComportamento;
	}

	@Override
	public String toString() {
		return "O aluno " + nome + " tem nota " + nota;
	}
	
	

}
