import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura online");
		palavras.add("Editora Casa do Código");
		palavras.add("Caelum");

		// Collections.sort(palavras, comparador);
		palavras.sort(( s1, s2) -> {
				if (s1.length() < s2.length()) {
					return -1;
				}
				if (s1.length() > s2.length()) {
					return 1;
				}

				return 0;
		});
		
		//palavras.sort(( s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));

		
		Function<String, Integer> funcao = String::length;
		//Function<String, Integer> funcao2 = s -> s.length();
		
		Comparator<String> comparator = Comparator.comparing(funcao);
		palavras.sort(comparator);
		
		System.out.println(palavras);
		
		Consumer<String> impressor = System.out::println;
		palavras.forEach(impressor);
		
		palavras.forEach(System.out::println);

	}

}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length()) {
			return -1;
		}
		if (s1.length() > s2.length()) {
			return 1;
		}

		return 0;
	}

}
