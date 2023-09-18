package aula12;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// crie uma matriz de 5 linhas e 1 coluna
		// some todos os valores
		// faça a media, e imprima somente os valores que estão acima dela

		int soma = 0;
		int media = 0;
		int[][] matriz = new int[5][1];

		matriz[0][0] = 1;
		matriz[1][0] = 2;
		matriz[2][0] = 3;
		matriz[3][0] = 4;
		matriz[4][0] = 5;

		for (int linha = 0; linha < 5; linha++) {
			soma = matriz[linha][0] + soma;
		}

		media = soma / 5;

		System.out.println("A soma de todos os números é: " + soma);
		System.out.println("A média é: " + media);
		
		System.out.println("Os valores acima da média são:");
		for (int linha = 0; linha < matriz.length; linha++) {
			if (matriz[linha][0] > media) {
				System.out.println(matriz[linha][0]);
			}
		}

	}

}
