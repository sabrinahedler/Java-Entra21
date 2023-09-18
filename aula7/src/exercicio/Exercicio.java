package exercicio;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int numero = 0;

		while (numero < 6) {
			System.out.println(numero);
			numero++;
		}

		System.out.println("Informe valores");
		int entrada = teclado.nextInt();

		while (entrada != 0) {
			System.out.println("Informe valores");
			entrada = teclado.nextInt();
		}

		System.out.println("fim");

		System.out.println("Informe uma letra");
		char entrada2 = teclado.next().charAt(0);

		while (entrada2 != 'a') {
			System.out.println("Informe uma letra");
			entrada2 = teclado.next().charAt(0);
		}

		System.out.println("fim");
	}

}
