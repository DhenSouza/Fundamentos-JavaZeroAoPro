package fundamentosJava.EstruturaControle.DesafiosControle;

public class DesafioFor {

	public static void main(String[] args) {
		
		/*
		 * Não pode usar valor numerico para controlar o laço
		 * */
		
		for(String valor = "#"; !valor.equals("######"); valor+="#") {
			System.out.println(valor);
		}

	}

}
