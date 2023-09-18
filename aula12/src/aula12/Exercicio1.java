package aula12;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// part1
		// crie uma matriz com 1 linha e 10 colunas
		// depois verifique quantos valores são impar e quantos são par
		// depois calcule a media

		// part2
		// criar uma segunda linha e novamente somar as colunas
		// por fim somem os valores da linha 0 e da linha 1

		int soma = 0;
		int media = 0;
		int impar = 0;
		int par = 0;
		int[][] matriz = new int[2][10];

		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		matriz[0][3] = 4;
		matriz[0][4] = 5;
		matriz[0][5] = 6;
		matriz[0][6] = 7;
		matriz[0][7] = 8;
		matriz[0][8] = 9;
		matriz[0][9] = 10;
		matriz[1][0] = 11;
		matriz[1][1] = 12;
		matriz[1][2] = 13;
		matriz[1][3] = 14;
		matriz[1][4] = 15;
		matriz[1][5] = 16;
		matriz[1][6] = 17;
		matriz[1][7] = 18;
		matriz[1][8] = 19;
		matriz[1][9] = 20;

		for (int coluna = 0; coluna < matriz[0].length; coluna++) {
			soma = matriz[0][coluna] + soma;
		}

		media = soma / matriz[0].length;
		System.out.println("Média: " + media);

		for (int coluna = 0; coluna < matriz[0].length; coluna++) {
			if (matriz[0][coluna] % 2 != 0) {
				impar++;
			} else {
				par++;
			}
		}

		System.out.println("Números pares: " + par);
		System.out.println("Números impares: " + impar);

		for (int coluna = 0; coluna < matriz[1].length; coluna++) {
			soma = matriz[1][coluna] + soma;
		}

		System.out.println("Soma da linha 1 e 2: " + soma);
	}

}
