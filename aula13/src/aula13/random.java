package aula13;

import java.util.Random;

public class random {

	public static void main(String[] args) {

		// como utilizar o comando random

		Random generator = new Random();

		int[][] matrizR = new int[2][2];

		for (int linha = 0; linha < 2; linha++) {
			for (int coluna = 0; coluna < 2; coluna++) {
				matrizR[linha][coluna] = generator.nextInt(10);
			}
		}

		for (int linha = 0; linha < 2; linha++) {
			for (int coluna = 0; coluna < 2; coluna++) {
				System.out.print(matrizR[linha][coluna]);
			}
			
			System.out.println();
		}

	}

}
