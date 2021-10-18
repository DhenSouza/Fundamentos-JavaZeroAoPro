package fundamentosJava.ClassesEMetodos.DesafiosClassesMetodos;

import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DataTeste {

	public static void main(String[] args) throws ParseException {
		Calendar date = new GregorianCalendar();
		Data data1 = new Data();

		data1.dia = date.get(Calendar.DAY_OF_MONTH);

		data1.mes = 10;

		data1.ano = date.get(Calendar.YEAR);

		Data data2 = new Data();

		data2.dia = 5;

		data2.mes = 8;

		data2.ano = 1998;

		System.out.println(data1.obterDataFormatada());
		System.out.println(data2.obterDataFormatada());

	}

}
