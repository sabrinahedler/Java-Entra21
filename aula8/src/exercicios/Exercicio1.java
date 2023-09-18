package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		// faça uma calculadora. O usuário entra com 2 valores e depois com a operação
		// desejada
		// após realizada a operação, solicite ao usuário se deseja continuar realizando
		// operações (sempre com valores novos)
		// digite qualquer tecla e caso queira encerrar informe a letra N

		Scanner teclado = new Scanner(System.in);

		double variavelAuxiliar = 0;

		System.out.println("Aperte qualquer tecla para iniciar");
		char op = teclado.next().charAt(0);

		while (op != 'n') {

			System.out.println("Digite dois números");
			double num1 = teclado.nextDouble();
			double num2 = teclado.nextDouble();

			System.out.println("Sendo 1-soma, 2-subtração, 3-multiplicação, 4-divisão");
			op = teclado.next().charAt(0);

			switch (op) {
			case '1':
				variavelAuxiliar = num1 + num2;
				break;
			case '2':
				variavelAuxiliar = num1 - num2;
				break;
			case '3':
				variavelAuxiliar = num1 * num2;
				break;
			case '4':
				variavelAuxiliar = num1 / num2;
				break;
			default:
				System.out.println("Invalido");
				break;
			}
			System.out.println("O resultado é " + variavelAuxiliar);

			System.out.println("Deseja continuar? Se sim, aperte qualquer tecla, se não, aperte N");
			op = teclado.next().charAt(0);

		}

	}
}
