package aula10;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// crie uma array de 5 elementos e descubra:
		// qual o maior elemento
		// qual menor elemento
		// a media dos elementos

		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira valores");
		
		int media = 0;
		int soma = 0;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;

		int tamanho = 5;
		int elementos[] = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			elementos[i] = teclado.nextInt();

			if (elementos[i] > maior) {
				maior = elementos[i];
			} else {
				menor = elementos[i];
			}

			soma = elementos[i] + soma;
			media = soma / tamanho;
		}

		System.out.println("O maior valor é " + maior);
		System.out.println("O menor valor é " + menor);
		System.out.println("A média dos valores é " + media);
	}

}
