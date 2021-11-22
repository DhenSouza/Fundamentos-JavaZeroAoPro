package fundamentosJava.generics;

public class CaixaTeste {

	public static void main(String[] args) {

		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("sdjfhdjk");
		
		String coisaA = caixaA.abrir();
		System.out.println(coisaA);

		Caixa<Double> CaixaB = new Caixa<>();
		CaixaB.guardar(3.1415);
		
		Double coisaB = CaixaB.abrir();
		System.out.println(coisaB);
		
		
	}

}
