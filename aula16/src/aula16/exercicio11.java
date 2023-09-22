package aula16;

import java.util.Scanner;

public class exercicio11 {

	// faça um programa que printe o número que o usuario entrou e os 20 numeros que
	// vem depois

	public static void numero(int num) {

		for (int i = 0; i < 20; i++) {
			System.out.println(num + i);
		}
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um numero");
		int num = teclado.nextInt();

		numero(num);
	}

}
