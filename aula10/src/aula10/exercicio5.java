package aula10;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// crie um array de 10 elementos e depois peça ao usuario para informar um
		// indice
		// imprima o valor que esta no vetor conforme indice informado pelo usuario

		Scanner teclado = new Scanner(System.in);
		int i = 0;
		int[] vetor = new int[10];

		System.out.println("Informe 10 valores");
		for (i = 0; i < vetor.length; i++) {
			vetor[i] = teclado.nextInt();
		}
		System.out.println("Informe o valor do indice");
		int indice = teclado.nextInt();

		for (i = 0; i < vetor.length; i++) {
			if (indice == i) {
				System.out.println(vetor[i]);
			}

		}
	}
}
