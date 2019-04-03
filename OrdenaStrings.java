package br.com.jonatan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura online");
		palavras.add("Editora casa do codigo");
		palavras.add("Caelum");

//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

//		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));

		System.out.println(palavras);

		Consumer<String> impressor = System.out::println;
		palavras.forEach(impressor);

		palavras.forEach(System.out::println);

	}

class ComparadorPorTamanho implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}
}
}