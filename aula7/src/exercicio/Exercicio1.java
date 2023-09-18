package exercicio;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// escreva um algoritmo que leia um número do teclado até que encontre um número
		// menor ou igual a 1

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um número");
		int numero = teclado.nextInt();

		while (numero > 1) {
			System.out.println("Digite um número");
			numero = teclado.nextInt();

		}

		System.out.println("fim");
	}

}
