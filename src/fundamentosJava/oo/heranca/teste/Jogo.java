package fundamentosJava.oo.heranca.teste;

import fundamentosJava.oo.heranca.Direcao;
import fundamentosJava.oo.heranca.Heroi;
import fundamentosJava.oo.heranca.Jogador;
import fundamentosJava.oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {

		Jogador monstro = new Monstro();
		Jogador heroi = new Heroi();

		monstro.setX(10);
		monstro.setY(10);
		heroi.setX(10);
		heroi.setY(11);

		System.out.println("Monstro tem " + monstro.getVida() + " de Vida");
		System.out.println("Heroi tem " + heroi.getVida() + " de Vida");

		System.out.println("Rodada de ataques... ");
		
		for(int i=0; i < 4; i++) {
			System.out.println("Rodada " + (i+1) + " de ataque...");
			if(i > 2) {
				monstro.andar(Direcao.NORTE);
			} 
			
				monstro.atacar(heroi);
				heroi.atacar(monstro);
				System.out.println("Monstro tem " + monstro.getVida() + " de Vida");
				System.out.println("Heroi tem " + heroi.getVida() + " de Vida");
			
		}
		

		System.out.println("Monstro tem " + monstro.getVida() + " de Vida");
		System.out.println("Heroi tem " + heroi.getVida() + " de Vida");
	}

}
