package exercicio9;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// escreva um algoritmo em que o usuario entra com um numero
		// se o usuario escolher 1, some 10 ao valor
		// caso 2 subtraia 10
		// caso 3 multiplique por 10
		// caso 4 divida por 10

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número");

		double numero = teclado.nextDouble();
		double variavel = 0;
		System.out.println("Digite o número da operação desejada");
		System.out.println("Sendo 1-soma, 2-subtração, 3-multiplicação, 4-divisão");
		int operacao = teclado.nextInt();
		switch (operacao) {
		case 1:
			variavel = numero + 10;
			break;
		case 2:
			variavel = numero - 10;
			break;
		case 3:
			variavel = numero * 10;
			break;
		case 4:
			variavel = numero / 10;
			break;
		default:
			System.out.println("Invalido.");
			break;
		}

		System.out.println("O resultado é " + variavel);
	}

}
