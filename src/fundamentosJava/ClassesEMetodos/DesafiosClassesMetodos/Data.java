package fundamentosJava.ClassesEMetodos.DesafiosClassesMetodos;

public class Data {

	public Integer dia;
	public Integer mes;
	public Integer ano;

	public Data() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}

	public Data(Integer dia, Integer mes, Integer ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String obterDataFormatada() {
		return dia + "/" + mes + "/" + ano;
	}

}
