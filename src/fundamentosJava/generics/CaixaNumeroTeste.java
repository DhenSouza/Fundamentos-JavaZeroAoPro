package fundamentosJava.generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		
		caixaA.guardar(142.454);
		
		Double coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		CaixaNumero<Integer> caixaB = new CaixaNumero<>();
		
		caixaB.guardar(142);
		
		Integer coisaB = caixaB.abrir();
		System.out.println(coisaB);

	}

}
