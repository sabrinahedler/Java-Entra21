package prova;

import java.util.Iterator;
import java.util.Scanner;

public class SabrinaDomingosHedler_4 {

	public static void main(String[] args) {

		// o usuário seleciona a opção onde
		// 1) Solicita 3 notas e calcula a média,
		// 2) Retorna os dados do aluno em questão (informe seu nome e e-mail),
		// 3) Solicita 5 valores, verifica e retorna qual é o maior e o menor.
		// A opção 0 encerra o programa e qualquer outra é declarada como inválida, além
		// disso, informe
		// quantas vezes o usuário escolheu opções válidas antes de encerrar o programa
		// e quantas inválidas.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe um número, podendo ser 1, 2 ou 3");
		int num = teclado.nextInt();

		int contVal = 0;
		int contInv = 0;

		while (num != 0) {

			switch (num) {
			case 1:
				contVal++;
				double nota;
				double soma = 0;
				double media;

				System.out.println("Informe 3 notas");
				for (int i = 1; i <= 3; i++) {
					nota = teclado.nextDouble();
					soma = nota + soma;
				}
				media = soma / 3;
				System.out.println("A media das é " + media);
				break;
			case 2:
				contVal++;
				System.out.println("Informe seu nome e e-mail");
				String nome = teclado.next();
				String email = teclado.next();
				break;
			case 3:
				contVal++;
				int maior = Integer.MIN_VALUE;
				int menor = Integer.MAX_VALUE;

				int valor = 0;

				System.out.println("Agora informe 5 valores");
				for (int i = 0; i < 5; i++) {
					valor = teclado.nextInt();

					if (valor > maior) {
						maior = valor;
					}
					if (valor < menor) {
						menor = valor;
					}
				}

				System.out.println("O menor valor é " + menor);
				System.out.println("O maior valor é " + maior);
				break;
			default:
				System.out.println("Valor invalido");
				contInv++;
				break;
			}

			System.out.println("Informe um número, podendo ser 1, 2 ou 3");
			num = teclado.nextInt();
		}

		System.out.println("Opções inválidas " + contInv);
		System.out.println("Opcões válidas " + contVal);
	}

}
