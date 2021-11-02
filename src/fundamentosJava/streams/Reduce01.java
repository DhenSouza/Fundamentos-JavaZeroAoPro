package fundamentosJava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce01 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		BinaryOperator<Integer> sum = (ac, n) -> ac + n;

		Integer total = numbers.stream().reduce(sum).get();

		System.out.println("Total: " + total);

		Integer totalDois = numbers.stream().reduce(100, sum);

		System.out.println("Segundo total: " + totalDois);

		// Resultado foi um Optional<Integer>...
		numbers.stream().filter(n -> n > 5).reduce(sum).ifPresent(System.out::println);

	}

}
