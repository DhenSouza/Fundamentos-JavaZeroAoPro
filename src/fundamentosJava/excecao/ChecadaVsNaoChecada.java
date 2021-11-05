package fundamentosJava.excecao;

import javax.management.RuntimeErrorException;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		try {
			geraErro1();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Fim..............");

	}

	public static void geraErro1() {
		throw new RuntimeErrorException(null, "Ocorreu um erro #01");
	}
	
	public static void geraErro2() throws Exception {
		throw new Exception("Ocorreu outro erro #2");
	}
}
