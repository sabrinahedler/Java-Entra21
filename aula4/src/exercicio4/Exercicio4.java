package exercicio4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Faça uma calculadora
		// o usuario entra com 2 numeros e depois a operação desejada

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite dois números");
		double num1 = teclado.nextDouble();
		double num2 = teclado.nextDouble();

		System.out.println("Digite o número da operação desejada");
		System.out.println("Sendo 1-soma, 2-subtração, 3-multiplicação, 4-divisão");
		int operação = teclado.nextInt();

		// variavel auxiliar
		double variavelAuxiliar = 0;

		if (operação == 1) {
			variavelAuxiliar = num1 + num2;
		} else if (operação == 2) {
			variavelAuxiliar = num1 - num2;
		} else if (operação == 3) {
			variavelAuxiliar = num1 * num2;
		} else if (operação == 4) {
			variavelAuxiliar = num1 / num2;
		} else {
			System.out.println("Invalido.");
		}
		System.out.println("O resultado é " + variavelAuxiliar);
	}

}
