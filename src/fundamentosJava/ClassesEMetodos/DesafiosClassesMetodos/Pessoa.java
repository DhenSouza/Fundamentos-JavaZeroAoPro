package fundamentosJava.ClassesEMetodos.DesafiosClassesMetodos;

public class Pessoa {

	public String nome;
	public double peso;

	public Pessoa() {
	}

	public Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	public Double comer(Comida comida) {
		 return this.peso += comida.pesoComida;
	}

}
