package fundamentosJava.generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {

		List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

		String ultimaLinguagem = (String) ListaUtil.getUtil1(langs);
		System.out.println(ultimaLinguagem);

		Integer ultimoNumero = (Integer) ListaUtil.getUtil1(nums);
		System.out.println(ultimoNumero);

		String ultimaLinguagem2 = ListaUtil.getUtil2(langs);
		System.out.println(ultimaLinguagem2);

		Integer ultimoNumero2 = ListaUtil.<Integer>getUtil2(nums);
		System.out.println(ultimoNumero2);

	}

}
