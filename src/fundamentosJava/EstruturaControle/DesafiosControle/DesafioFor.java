package fundamentosJava.EstruturaControle.DesafiosControle;

public class DesafioFor {

	public static void main(String[] args) {
		
		/*
		 * N�o pode usar valor numerico para controlar o la�o
		 * */
		
		for(String valor = "#"; !valor.equals("######"); valor+="#") {
			System.out.println(valor);
		}

	}

}
