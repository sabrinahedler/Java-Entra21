package aula20;

import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {

	public static void main(String[] args) {

		// crie uma ArrayList e imprima os últimos elementos primeiro

		List<Integer> lista = new ArrayList<>();

		lista.add(23);
		lista.add(4);
		lista.add(45);
		lista.add(10);
		lista.add(19);

		for (int i = lista.size() - 1; i >= 0; i--) {
			int elemento = lista.get(i);

			System.out.println(elemento);
		}
	}

}
