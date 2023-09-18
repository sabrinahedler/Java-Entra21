package exercicio5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a
		// tabuada de 1 a 10 do valor lido

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um número de 1 á 10");
		int numero = teclado.nextInt();
		int resposta = 0;

		if (numero >= 1 && numero <= 10) {

			for (int i = 1; i <= 10; i++) {
				resposta = numero * i;
				System.out.println(numero + "x" + i + "=" + resposta);
			}

		} else {
			System.out.println("Número invalido");
		}

	}

}
