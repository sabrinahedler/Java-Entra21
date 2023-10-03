package aula20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		// faça um algoritmo que remova o valor do meio da ArrayList
		// caso a array tenha tamanho par, remova o valor da segunda metade
		// exemplo: em uma ArrayList de tamanho 6, remova o valor no indice 4

		Scanner scan = new Scanner(System.in);
		int valor = 0;

		List<Integer> lista = new ArrayList<>();

		System.out.println("digite um tamanho para a lista");
		int tamanho = scan.nextInt();

		System.out.println("Insira valores reais");
		for (int i = 0; i < tamanho; i++) {
			valor = scan.nextInt();
			lista.add(valor);
		}

		int meio = tamanho / 2;
		int segundaMetade = meio / 2;

		if (tamanho % 2 == 0) {
			lista.remove(meio);
		}
		if (tamanho % 2 != 0) {
			lista.remove(segundaMetade);
		}

		System.out.println(lista);

	}
}
