package aula9;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// faça um algoritmo em que quem preenche os valores do vetor é o usuario, por
		// fim printe o vetor
		// vetor 5 posições

		Scanner teclado = new Scanner(System.in);

		String elementos[] = new String[5];

		System.out.println("Informe 5 valores");

		for (int i = 0; i < 5; i++) {
			elementos[i] = teclado.next();
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(elementos[i]);
		}

	}

}
