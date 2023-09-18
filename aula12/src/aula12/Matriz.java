package aula12;

import java.util.Arrays;

public class Matriz {

	public static void main(String[] args) {

		// matriz com 2 linhas e 4 colunas do tipo inteiro

		int[][] matriz = new int[2][4];

		int soma = 0;
		
		matriz[0][0] = 10;
		matriz[0][1] = 20;
		matriz[0][2] = 30;
		matriz[0][3] = 40;

		for (int coluna = 0; coluna < matriz[0].length; coluna++) {
			System.out.println(matriz[0][coluna]);
			
			soma = matriz[0][coluna] + soma;
		}
		
		System.out.println("Soma: " + soma);
	}

}
