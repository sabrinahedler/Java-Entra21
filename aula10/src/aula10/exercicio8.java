package aula10;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de
		// 12 posições do tipo real
		// imprima quais valores desses informados são maiores que a média dos valores

		Scanner teclado = new Scanner(System.in);

		int soma = 0;
		int media = 0;
		int i;
		int[] vetor = new int[12];

		System.out.println("Informe 12 valores");
		for (i = 0; i < vetor.length; i++) {
			vetor[i] = teclado.nextInt();

			soma = vetor[i] + soma;
		}

		media = soma / vetor.length;

		System.out.println("Maiores valores:");
		for (i = 0; i < vetor.length; i++) {
			if (vetor[i] > media) {
				System.out.println(vetor[i]);
			}
		}
	}

}
