package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		System.out.println("Escreva um número");
		int numero = teclado.nextInt();

		if (numero % 2 == 0) {
			System.out.println("Este número é par");
		} else {
	
			System.out.println("Este número é ímpar");
		}

	}

}
