package fundamentosJava.oo.heranca.desafio;

public class Carro {

	final Integer VELOCIDADE_MAXIMA;
	private Integer velocidadeAtual;
	private Integer delta = 5;

	protected Carro(Integer velocidadeMaxima) {
		this.velocidadeAtual = 0;
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public Integer acelerar() {
		if ((this.velocidadeAtual + getDelta()) > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}
		return velocidadeAtual += getDelta();
	}

	public Integer freiar() {
		if (velocidadeAtual >= 5) {
			return velocidadeAtual -= 5;
		}
		return 0;
	}

	public Integer getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(Integer velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	@Override
	public String toString() {
		return "Velocidade: " + velocidadeAtual + " km/H";
	}

	public Integer getDelta() {
		return delta;
	}

	public void setDelta(Integer delta) {
		this.delta = delta;
	}

}
