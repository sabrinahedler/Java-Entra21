package aula14;

import java.util.Scanner;

public class exercicio3R {

	public static void main(String[] args) {

		// Descreva um algoritmo que vá lendo números inteiros até o usuario entrar com
		// o numero 0
		// a. qual o menor valor?
		// b. qual o maior valor?
		// c. qual a media dos valores?

		Scanner teclado = new Scanner(System.in);

		double media = 0;
		double soma = 0;
		double contador = 0;

		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;

		System.out.println("Digite um número inteiro");
		int numero = teclado.nextInt();

		while (numero != 0) {
			soma = soma + numero;
			contador++;
			numero = teclado.nextInt();
			
			// resposta A e B
			if (numero < menor) {
				menor = numero;
			}
			if (numero > maior) {
				maior = numero;
			}
		}
		
		// resposta C
		media = soma / contador;

		System.out.println("O menor valor é " + menor);
		System.out.println("O maior valor é " + maior);
		System.out.println("O media dos valores é " + media);
	}

}
