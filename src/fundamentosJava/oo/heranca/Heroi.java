package fundamentosJava.oo.heranca;

public class Heroi extends Jogador{

	public boolean atacar(Jogador oponente) {

		Integer deltaX = Math.abs(this.getX()- oponente.getX());
		Integer deltaY = Math.abs(this.getY() - oponente.getY());

		if (deltaX == 0 && deltaY == 1) {
			Integer aux = oponente.getVida() - 20;
			oponente.setVida(aux);
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
			Integer aux = oponente.getVida() - 20;
			oponente.setVida(aux);
			return true;
		}
		return false;
	}
}
