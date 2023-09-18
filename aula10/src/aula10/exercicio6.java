package aula10;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// crie um array de elementos e depois peça ao usuario para informar um valor
		// verifique se este valor está presente no array e printe o indice

		Scanner teclado = new Scanner(System.in);

		int[] vetor = new int[5];
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Informe um valor");
			vetor[i] = teclado.nextInt();
		}

		System.out.println("Informe um valor para " + "ver se esta presente");
		int variavel = teclado.nextInt();

		boolean possuiElemento = false;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == variavel) {
				possuiElemento = true;
				System.out.println("Indice: " + i);
			}
		}

		if (possuiElemento == false) {
			System.out.println("Não está presente.");
		}

	}

}
