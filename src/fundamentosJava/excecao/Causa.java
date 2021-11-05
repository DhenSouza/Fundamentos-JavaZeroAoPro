package fundamentosJava.excecao;

public class Causa {

	public static void main(String[] args) {
		
		try {
			metodoA(null);
		} catch (Exception ex) {
			System.out.println(ex.getCause().getMessage());
		}
	}
	
	public static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception causa) {
			throw new IllegalArgumentException(causa);
		}
	}
	public static void metodoB(Aluno aluno) {
		if(aluno == null) {
			throw new NullPointerException("O ALUNO ESTA NULO");
		}
		
		System.out.println(aluno.getNome());
	}

}
