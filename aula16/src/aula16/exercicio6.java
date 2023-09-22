package aula16;

import java.util.Scanner;

public class exercicio6 {

	// faça um programa em que o usuário entre com número de 1 a 4
	// com o número 1 sendo verao, 2 outono e etc
	// dependendo do que o usuario informe, printe:
	// é verão, esta quente e etc

	public static void estacao(int escolha) {

		switch (escolha) {
		case 1:
			System.out.println("é verão e está quente");
			break;
		case 2:
			System.out.println("é outono e está morno");
			break;
		case 3:
			System.out.println("é inverno e está frio");
			break;
		case 4:
			System.out.println("é primavera e está morno");
			break;
		default:
			break;
		}
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um número de 1 á 4");
		int escolha = teclado.nextInt();

		estacao(escolha);
	}

}
