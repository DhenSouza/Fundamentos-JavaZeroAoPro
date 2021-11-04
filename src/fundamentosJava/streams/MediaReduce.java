package fundamentosJava.streams;

public class MediaReduce {

	private double total;
	private Integer quantidade = 0;

	public MediaReduce adicionar(Double valor) {
		total += valor;
		quantidade++;
		return this;
	}

	public Double getValor() {
		return this.total / this.quantidade;
	}

	public static MediaReduce combinar(MediaReduce m1, MediaReduce m2) {
		MediaReduce resultante = new MediaReduce();
		resultante.total = m1.total + m2.total;
		resultante.quantidade = m1.quantidade + m2.quantidade;
		return resultante;
	}

}
