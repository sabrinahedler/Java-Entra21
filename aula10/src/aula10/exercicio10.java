package aula10;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// faça um algoritmo em que quem preenche os valores do vetor é o usuario
		// por fim printe o vetor (vetor de 5 posições)

		Scanner teclado = new Scanner(System.in);

		int vetor[] = new int[5];
		int i = 0;
		for (i = 0; i < vetor.length; i++) {
			vetor[i] = teclado.nextInt();

		}
		for (i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
