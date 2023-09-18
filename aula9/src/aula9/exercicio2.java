package aula9;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		// crie um programa que solicite 3 notas
		// depois imprima a media

		Scanner teclado = new Scanner(System.in);

		double soma = 0;
		double media = 0;

		System.out.println("Escreva 3 notas");

		double notas[] = new double[3];

		notas[0] = teclado.nextDouble();
		notas[1] = teclado.nextDouble();
		notas[2] = teclado.nextDouble();

		soma = notas[0] + notas[1] + notas[2];
		media = soma / 3;

		System.out.println("A media das notas é " + media);

	}

}
