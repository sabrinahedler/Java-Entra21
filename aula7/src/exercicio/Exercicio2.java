package exercicio;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// crie um programa que leia um número do teclado até que encontre um número
		// igual a zero
		// no final, mostre a soma dos números digitados

		Scanner teclado = new Scanner(System.in);
		int soma = 0;

		System.out.println("Digite um número");
		int numero = teclado.nextInt();

		while (numero != 0 ) {
			soma = soma + numero;
			System.out.println("Digite um número");
			numero = teclado.nextInt();
			
		}

		System.out.println("A soma dos números digitados é " + soma);
	}

}
