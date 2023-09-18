package aula12;

public class Exercicio4 {

	public static void main(String[] args) {

		// crie uma matriz de 3 linhas e 3 colunas
		// preencha-a de A até I
		// depois a imprima

		char[][] matriz = new char[3][3];

		matriz[0][0] = 'A';
		matriz[0][1] = 'B';
		matriz[0][2] = 'C';
		matriz[1][0] = 'D';
		matriz[1][1] = 'E';
		matriz[1][2] = 'F';
		matriz[2][0] = 'G';
		matriz[2][1] = 'H';
		matriz[2][2] = 'I';

		for (char linha = 0; linha < 3; linha++) {
			for (char coluna = 0; coluna < 3; coluna++) {
				System.out.print(matriz[linha][coluna]);
			}
			System.out.println();
		}

	}

}
