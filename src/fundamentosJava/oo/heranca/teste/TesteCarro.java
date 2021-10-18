package fundamentosJava.oo.heranca.teste;

import fundamentosJava.oo.heranca.desafio.Carro;
import fundamentosJava.oo.heranca.desafio.Corsa;
import fundamentosJava.oo.heranca.desafio.Ferrari;

public class TesteCarro {

	public static void main(String[] args) {
		Ferrari ferrari = new Ferrari();
		Carro corsa = new Corsa();

		System.out.println("Preparar, Go.... ");
		for (int i = 0; i < 3; i++) {
			ferrari.ligarTurbo();
			ferrari.ligarAr();
			ferrari.desligarAr();

			ferrari.acelerar();
			corsa.acelerar();

			System.out.print("Ferrari " + ferrari + " ");
			System.out.println("Corsa " + corsa);
		}

	}
}
