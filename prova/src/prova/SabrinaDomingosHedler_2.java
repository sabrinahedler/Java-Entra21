package prova;

import java.util.Scanner;

public class SabrinaDomingosHedler_2 {

	public static void main(String[] args) {

		// Escreva um programa onde o usuário informa os dados dos lados de um triangulo
		// depois
		// verifique e retorne se ele é isóscele, escaleno ou equilátero.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe 1 valor para cada lado de um triangulo");
		int valorUm = teclado.nextInt();
		int valorDois = teclado.nextInt();
		int valorTres = teclado.nextInt();

		if (valorUm == valorDois && valorUm == valorTres) {
			System.out.println("Este triangulo é equilatero");
		} else if (valorUm == valorDois || valorDois == valorTres || valorUm == valorTres) {
			System.out.println("Este triangulo é isóscele");
		} else {
			System.out.println("Este triangulo é escaleno");
		}
	}

}
