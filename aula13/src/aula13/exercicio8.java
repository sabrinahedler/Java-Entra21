package aula13;

public class exercicio8 {

	public static void main(String[] args) {

		// dada a seguinte matriz, calcule:

		// 1 2 3 4
		// 5 6 7 8
		// 9 10 11 12
		// 13 14 15 16

		// a) a soma dos elementos de primeira coluna
		// b) o produto dos elementos da primeira linha
		// c) a soma de todos os elementos
		// d) o produto da diagonal principal

		int soma = 0;
		int produto = 1;
		int somaTotal = 0;
		int diagonal = 1;

		int[][] matriz = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		// resposta A
		for (int linha = 0; linha < matriz.length; linha++) {
			soma = soma + matriz[linha][0];
		}

		System.out.println("Soma: " + soma);

		// resposta B
		for (int coluna = 0; coluna < matriz[0].length; coluna++) {
			produto = produto * matriz[0][coluna];
		}

		System.out.println("Produto: " + produto);

		// resposta C e D
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				somaTotal = somaTotal + matriz[linha][coluna];

				if (coluna == linha) {
					diagonal = diagonal * matriz[linha][coluna];
				}
			}
		}

		System.out.println("Soma total: " + somaTotal);
		System.out.println("Diagonal: " + diagonal);
	}
}