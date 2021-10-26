package fundamentosJava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {

		Consumer<String> print = System.out::print;
		// Consumer<Integer> printInteger = System.out::println;

		// 1º forma de printar
		Stream<String> langs = Stream.of("Java ", "Ruby ", "Raskell ", "PHP\n");
		langs.forEach(print);

		// 2º forma de printar
		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "GO\n" };
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 3).forEach(print);

		// 3º forma de printar
		List<String> outrasLangs = Arrays.asList("C ", "Kotlin ", "Elixir\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);

		// Para gerar Infinitamente
		// Stream.generate(() -> "a").forEach(print);
		// Stream.iterate(0, n -> n + 1).forEach(printInteger);
	}

}
