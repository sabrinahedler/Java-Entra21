package aula9;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int idades[] = new int[4];

		idades[0] = 22;
		idades[1] = 16;
		idades[2] = 17;
		idades[3] = 27;

		System.out.println(idades[0]);
		System.out.println(idades[3]);

		int soma = 0;
		int media = 0;
		soma = idades[0] + idades[1] + idades[2] + idades[3];
		media = soma / 4;

		System.out.println("A media das idades é " + media);

		for (int i = 0; i < 4; i++) {

			System.out.println(idades[i]);
		}
		// vetor String

		String[] nomes = new String[21];
		for (int i = 0; i < 21; i++) {
			nomes[i] = teclado.next();
		}

		for (int i = 0; i < 21; i++) {
			System.out.println(nomes[i]);
		}
	}

}
