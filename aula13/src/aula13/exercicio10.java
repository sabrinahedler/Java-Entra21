package aula13;

import java.util.Random;

public class exercicio10 {

	public static void main(String[] args) {

		// crie uma matriz 3x5 e preencha-a usando Random, depois:
		// a. informe quantas vezes a matriz repete o número 0
		// b. a quantidade de numeros pares
		// c. a quantidade de números impares

		Random generator = new Random();

		int contador = 0;
		int contador2 = 0;

		int[][] matriz = new int[3][5];

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				matriz[linha][coluna] = generator.nextInt(10);
			}
		}

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				System.out.print(matriz[linha][coluna]);
			}

			System.out.println();
		}

		// resposta A
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				if (matriz[linha][coluna] == 0) {
					contador++;
				}
			}
		}

		System.out.println("O número zero aparece " + contador + " vezes");

		contador = 0;

		// resposta B e C

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				if (matriz[linha][coluna] % 2 == 0) {
					contador++;
				} else {
					contador2++;
				}
			}
		}
		System.out.println("A matriz tem " + contador + " números pares");
		System.out.println("A matriz tem " + contador2 + " números ímpares");
	}

}
