package fundamentosJava.lambda;

public class Somar implements Calculo{

	@Override
	public Double executar(double a, double b) {
		return a + b;
	}

}
