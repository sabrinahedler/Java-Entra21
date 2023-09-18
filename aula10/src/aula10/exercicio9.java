package aula10;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// faça um programa para ler os valores de dois vetores de inteiros, cada um
		// contendo 10 elementos
		// crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas
		// posições respectivas dos vetores originais

		Scanner teclado = new Scanner(System.in);

		int[] vetor1 = new int[10];
		int i;

		System.out.println("Informe 10 valores");
		for (i = 0; i < vetor1.length; i++) {
			vetor1[i] = teclado.nextInt();
		}

		int[] vetor2 = new int[10];
		System.out.println("Informe 10 valores");
		for (i = 0; i < vetor2.length; i++) {
			vetor2[i] = teclado.nextInt();
		}

		int[] vetor3 = new int[10];
		System.out.println("Informe 10 valores");
		for (i = 0; i < vetor3.length; i++) {
			vetor3[i] = teclado.nextInt();
		}

		System.out.println(Arrays.toString(vetor1));
		System.out.println(Arrays.toString(vetor2));
		System.out.println(Arrays.toString(vetor3));

	}

}
