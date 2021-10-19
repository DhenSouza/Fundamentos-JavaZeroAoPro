package fundamentosJava.lambda;

public class Multiplicar implements Calculo{

	@Override
	public Double executar(double a, double b) {
		return a * b;
	}

}
