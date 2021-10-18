package fundamentosJava.EstruturaControle;

public class TestWhile {
	public static void main(String[] args) {
		int contator = 1;
		
		while (contator <= 10) {
			System.out.println("Bom dia!");
			contator++;
		}
		
		// diferença entre o ++ antes e depois da variavel;
		int x=0, y=0;
		System.out.printf("x: %d \n y: %d", x++, ++y);
		System.out.printf("\n\n x: %d \n y: %d", x, y);
	    
	}

}
