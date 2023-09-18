package exercicio;

import java.util.Scanner;

public class Exercicio3part2 {
	public static void main(String[] args) {
		// construa um contador que comece com 0 onde ele precisa chegar ao numero 10
		// para o contador contar precisa-se que o valor seja valido

		Scanner teclado = new Scanner(System.in);
		int contador = 0;

		System.out.println("Digite um número entre 12 e 20");
		int valor = teclado.nextInt();

		while (valor < 12 || valor > 20) {
			System.out.println("Invalído, tente novamente");
			valor = teclado.nextInt();
			contador++;

		}

	}
}
