package fundamentosJava.oo.heranca;

public class Jogador {

	private Integer vida = 100;
	private Integer x;
	private Integer y;

	public boolean atacar(Jogador oponente) {

		Integer deltaX = Math.abs(x - oponente.getX());
		Integer deltaY = Math.abs(y - oponente.getY());

		if (deltaX == 0 && deltaY == 1) {
			Integer aux = oponente.getVida() - 10;
			oponente.setVida(aux);
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
			Integer aux = oponente.getVida() - 10;
			oponente.setVida(aux);
			return true;
		}
		return false;
	}

	public boolean andar(Direcao direcao) {

		switch (direcao) {
		case NORTE:
			this.y--;
			break;
		case LESTE:
			this.x++;
			break;
		case SUL:
			this.y++;
			break;
		case OESTE:
			this.x--;
			break;
		}

		return true;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public Integer getVida() {
		return vida;
	}

	public void setVida(Integer vida) {
		this.vida = vida;
	}

}
