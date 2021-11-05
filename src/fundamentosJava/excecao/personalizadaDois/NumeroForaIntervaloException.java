package fundamentosJava.excecao.personalizadaDois;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends Exception {
	// Exceção checada
	private String nomeDoAtributo;

	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}

	public String getMessage() {
		return String.format("O atributo '%s' esta fora do intervalo", this.nomeDoAtributo);
	}

}
