package aula9;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		// faça um algoritmo que atribua valores ao vetor de acordo com o quadrado do
		// seu indice e printe o vetor

		int elementos[] = new int[4];

		for (int i = 0; i < 4; i++) {
			elementos[i] = i * i;
		}

		for (int i = 0; i < 4; i++) {
			System.out.println(elementos[i]);
		}

	}

}
