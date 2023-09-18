package aula14;

import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {

		// como usar doWhile
		// diferente do while normal que temos a necessidade de pedir os dados antes de
		// entrar no laço de repetição
		// o doWhile executará ao menos uma vez e posteriormente validará se deve
		// continuar repetindo

		Scanner teclado = new Scanner(System.in);

		int numero = 0;

		do {
			System.out.println("Informe um numero");
			numero = teclado.nextInt();
		} while (numero != 0);

	}

}
