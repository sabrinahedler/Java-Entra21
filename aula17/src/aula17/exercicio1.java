package aula17;

import java.util.Scanner;

public class exercicio1 {

	// faça um código que recebe uma palavra do usuario, se essa palavra tem tamanho
	// par, printe o primeiro caracter dessa palavra
	// caso ela tenha tamanho impar, printe o segundo caracter dessa palavra

	public static void palavra(String palavra) {

		if (palavra.length() % 2 == 0) {
			System.out.println(palavra.charAt(0));
		} else {
			System.out.println(palavra.charAt(1));
		}
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite uma palavra");
		String palavra = teclado.next();

		palavra(palavra);
	}

}
