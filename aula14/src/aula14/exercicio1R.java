package aula14;

import java.util.Scanner;

public class exercicio1R {

	public static void main(String[] args) {

		// o indice de massa corporal é determinado pela divisao de massa do individuo
		// pelo quadrado de sua altura, onde a massa esta em kg
		// e a altura esta em metros, de acordo com a formula: IMC = massa / altura2
		// faça um algoritmo para classificar o IMC e dizer o grau de obesidade do
		// individuo, de acordo com a seguinte tabela:
		// < 18.5 Magreza
		// 18.5 - 24.9 saudavel
		// 25.0 - 29.9 sobrepeso
		// 30.0 - 34.9 obesidade grau |
		// 35.0 - 39.9 obesidade grau ||
		// 40.0 obesidade grau |||

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite seu peso:");
		double peso = teclado.nextDouble();

		System.out.println("Digite sua altura:");
		double altura = teclado.nextDouble();

		double multiplicacao = altura * altura;

		double conta = peso / multiplicacao;

		if (conta < 18.5) {
			System.out.println("Magreza");
		} else if (conta < 25.0) {
			System.out.println("Saudavel");
		} else if (conta < 30.0) {
			System.out.println("Sobrepeso");
		} else if (conta < 35) {
			System.out.println("Obesidade grau l");
		} else if (conta < 40) {
			System.out.println("Obesidade grau ll");
		} else {
			System.out.println("Obesidade grau lll");

		}
	}

}
