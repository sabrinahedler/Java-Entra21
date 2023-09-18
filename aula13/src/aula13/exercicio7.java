package aula13;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
	
		// Crie uma matriz 3x3 do tipo char, onde o usuário preenche valores utilizando
		// o scanner, ao fim imprima a matriz

		Scanner teclado = new Scanner(System.in);

		char[][] matriz = new char[3][3];

		System.out.println("Preencha os valores da matriz");
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				matriz[linha][coluna] = teclado.next().charAt(0);
			}
		}
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.print(matriz[linha][coluna]);
			}
			System.out.println();
		}
	}
}
