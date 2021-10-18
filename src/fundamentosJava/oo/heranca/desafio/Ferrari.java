package fundamentosJava.oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo;
	private boolean ligarAr;

	public Ferrari() {
		this(300);
	}

	public Ferrari(Integer velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}

	@Override
	public Integer getDelta() {
		if (this.ligarTurbo && !ligarAr) {
			return 35;
		} else if (this.ligarTurbo && this.ligarAr) {
			return 30;
		} else if (!this.ligarTurbo && !this.ligarAr) {
			return 20;
		}
		return 15;
	}

}
