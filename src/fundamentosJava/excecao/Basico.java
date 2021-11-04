package fundamentosJava.excecao;

public class Basico {

	public static void main(String[] args) {
		
		
		Aluno a1 = null;
		
		try {
			imprimirNomeAluno(a1);
			
		} catch (NullPointerException ex) {
			System.out.println("Ocorreu um erro no momento de imprimir "
					+ "o nome do usuario, o nome esta: " + ex.getMessage());
		}
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException ex) {
			System.out.println("Não pode dividir um numero " + ex.getMessage());
		}
		
		System.out.println("Fim");

	}
	
	public static void imprimirNomeAluno(Aluno aluno) {
		System.out.println(aluno.getNome());
	}

}
