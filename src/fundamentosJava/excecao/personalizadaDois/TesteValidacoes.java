package fundamentosJava.excecao.personalizadaDois;

import fundamentosJava.excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {
		
		Aluno a1;
		try {
			a1 = new Aluno("Leco", 7.);
			Validar.Aluno(a1);
			
			Validar.Aluno(null);
		} catch (StringVaziaException ex) {
			System.out.println(ex.getMessage());
		} catch(NumeroForaIntervaloException | IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
		
		
		System.out.println("Fim ...");

	}

}
