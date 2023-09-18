package aula12;

public class Exemplo {

	public static void main(String[] args) {

		// criando uma matriz da maneira pratica
		// um for dentro do outro, criando a linha e coluna

		int[][] matriz = new int[2][5];

		matriz[0][0] = 10;
		matriz[0][1] = 20;
		matriz[0][2] = 30;
		matriz[0][3] = 40;
		matriz[0][4] = 50;
		matriz[1][0] = 60;
		matriz[1][1] = 70;
		matriz[1][2] = 80;
		matriz[1][3] = 90;
		matriz[1][4] = 100;

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
			}
		}
	}

}
