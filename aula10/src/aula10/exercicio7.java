package aula10;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {

		// faça um algoritmo que coloque o número 0 no indice que o usuario escolheu
		// e printe o vetor

		Scanner teclado = new Scanner(System.in);

		int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("Informe um indice");
		int indice = teclado.nextInt();

		vetor[indice] = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

	}

}
