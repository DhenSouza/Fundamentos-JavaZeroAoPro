package fundamentosJava.oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		Pessoa convidado = new Pessoa(99.65);
		Comida ingredientes;
		System.out.println("Peso inicial: " + convidado.getPeso());
		
		// Arroz
		ingredientes = new Arroz(0.200);
		convidado.comer(ingredientes);
		System.out.println("Peso depois do arroz: " + convidado.getPeso());
		
		// Feijao
		ingredientes = new Feijao(0.100);
		convidado.comer(ingredientes);
		System.out.println("Peso depois do feijao: " + convidado.getPeso());
		
		// Sorvete
		ingredientes = new Sorvete(0.4);
		convidado.comer(ingredientes);
		System.out.println("Peso depois do sorvete: " + convidado.getPeso());

	}

}
