package fundamentosJava.ClassesEMetodos.DesafiosClassesMetodos;

public class Jantar {

	public static void main(String[] args) {

		
		Comida c1 = new Comida("Bolo", 0.6);
		Comida c2 = new Comida("Pastel", 0.8);
		
		Pessoa p1 = new Pessoa("Vitor", 89.0);
		
		System.out.println("O peso da pessoa antes de comer: " + p1.peso);
		
		Double primeiroItem = p1.comer(c1);
		Double segundoItem = p1.comer(c2);
		
		System.out.println("A pessoa consumiu: " + (primeiroItem+segundoItem) + " calorias.");
		
		System.out.println("O peso da pessoa depois de comer: " + p1.peso);
	}

}
