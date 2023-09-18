package exercicio;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// faça um programa que receba um nome de uma fruta como entrada
		// faça varias cases para as frutas que você conhece

		Scanner teclado = new Scanner(System.in);
		System.out.println("Escreva o nome de uma fruta");
		String fruta = teclado.next();

		while (fruta.equalsIgnoreCase("banana") || fruta.equalsIgnoreCase("melancia")
				|| fruta.equalsIgnoreCase("morango") || fruta.equalsIgnoreCase("manga")) {

			switch (fruta) {
			case "banana":
				System.out.println("Eu gosto dessa fruta");
				break;
			case "melancia":
				System.out.println("Eu não dessa fruta");
				break;
			case "morango":
				System.out.println("Eu gosto dessa fruta");
				break;
			case "manga":
				System.out.println("Eu gosto dessa fruta");
				break;
			default:
				break;
			}
			System.out.println("Escreva o nome de uma fruta");
			fruta = teclado.next();
		}
		System.out.println("Eu não conheço essa fruta");
	}

}
