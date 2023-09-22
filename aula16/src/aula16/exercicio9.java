package aula16;

import java.util.Scanner;

public class exercicio9 {

	// faça um programa que receba 2 números do usuario
	// faça um metodo que descubra qual dos numeros é maior
	// se os numeros forem iguais, informe: numeros iguais

	public static void verificacao(int numeroUm, int numeroDois) {
		if (numeroUm > numeroDois) {
			System.out.println(numeroUm + " é o maior numero");
		} else if (numeroUm < numeroDois) {
			System.out.println(numeroDois + " é o maior numero");
		} else {
			System.out.println("os números são iguais");
		}
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe dois numeros");
		int numeroUm = teclado.nextInt();
		int numeroDois = teclado.nextInt();

		verificacao(numeroUm, numeroDois);
	}

}
