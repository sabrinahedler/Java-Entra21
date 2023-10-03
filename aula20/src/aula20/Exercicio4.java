package aula20;

import java.util.ArrayList;
import java.util.List;

public class Exercicio4 {

	public static void main(String[] args) {
		
		// faça um algoritmo que atribua valores á Array List de acordo com o quadrado do seu índice
		// exemplo:
		// [0] = 0
		// [1] = 1
		// [2] = 4
		// [3] = 9
		// [4] = 16
		
		int numero = 0;
		
		List<Integer> lista = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			numero = i * i;
			lista.add(numero);
		}
		
		System.out.println(lista);
		
	}

}
