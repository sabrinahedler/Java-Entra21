package aula20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		// crie um algoritmo que leia 5 valores decimais e os coloque em uma ArrayList
		// modifique a ArrayList de modo que os valores das posições ímpares
		// sejam aumentados em 5% e os pares sejam aumentados 2%
		// depois imprima a ArrayList

		Scanner scan = new Scanner(System.in);
		double valor = 0;

		List<Double> lista = new ArrayList<>();

		System.out.println("Informe 5 valores decimais");
		for (int i = 0; i < 5; i++) {
			valor = scan.nextDouble();

			if (i % 2 == 0) {
				valor = valor + 0.05;
			}
			if (i % 2 != 0) {
				valor = valor + 0.02;
			}

			lista.add(valor);
		}

		System.out.println(lista);
	}
}
