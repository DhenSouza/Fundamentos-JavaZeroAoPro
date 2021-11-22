package fundamentosJava.generics;

public class CaixaObjetoTest {

	public static void main(String[] args) {
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); ///  double -> Double
		Double coisaA = (Double) caixaA.abrir();
		System.out.println(coisaA);
		
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaA.guardar("Ola"); 
		String coisaB = (String) caixaA.abrir();
		System.out.println(coisaB);
	}

}
