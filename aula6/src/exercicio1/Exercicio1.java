package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// faça um programa, utilizando for, que permite
		// o usuário fazer 3 contas de subtração

		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Escreva 2 números");

			int numero1 = teclado.nextInt();
			int numero2 = teclado.nextInt();
			int operacao1 = numero1 - numero2;
			System.out.println("O resultado da primeira conta é " + operacao1);
		}

	}
}