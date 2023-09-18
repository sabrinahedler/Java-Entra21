package aula13;

import java.util.Random;

public class exercicio9 {

	public static void main(String[] args) {

		// crie uma matriz de 7 linhas e 8 colunas
		// preencha-a usando Random e depois a imprima

		Random generator = new Random();

		int[][] matrizR = new int[7][8];

		for (int linha = 0; linha < 7; linha++) {
			for (int coluna = 0; coluna < 8; coluna++) {
				matrizR[linha][coluna] = generator.nextInt(10);
			}
		}

		for (int linha = 0; linha < 7; linha++) {
			for (int coluna = 0; coluna < 8; coluna++) {
				System.out.print(matrizR[linha][coluna] + ", ");
			}

			System.out.println();
		}

	}

}
