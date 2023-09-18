package prova;

import java.util.Scanner;

public class SabrinaDomingosHedler_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Escreva um programa onde o usuário informa um valor e a opção desejada do que
		// deve ser feito com o valor
		// sendo as opções 1-converter de dólar para real e 2-converter de real para
		// dólar
		// qualquer outra opção é considerada entrada inválida.

		Scanner teclado = new Scanner(System.in);
		double resposta = 0;

		System.out.println("Informe um valor");
		double valor = teclado.nextDouble();

		System.out.println(
				"Informe a operação desejada, sendo 1 para converter de dólar para real e 2 para converter de real para dólar");
		int operacao = teclado.nextInt();

		switch (operacao) {
		case 1:
			resposta = valor * 4.97;
			break;

		case 2:
			resposta = 4.97 / valor;
			break;

		default:
			System.out.println("Valor invalido");
			break;
		}

		System.out.println("O valor é " + resposta);

	}

}
