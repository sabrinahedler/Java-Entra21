package prova;

import java.util.Scanner;

public class SabrinaDomingosHedler_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Escreva um programa onde o usuário leia altura de 10 pessoas diferentes
		// depois calcule a média.

		Scanner teclado = new Scanner(System.in);

		double soma = 0;
		double media = 0;
		int contador = 0;

		System.out.println("Informe a altura de 10 pessoas diferentes");

		for (int i = 0; i < 10; i++) {
			double altura = teclado.nextDouble();
			soma = soma + altura;
			contador++;
		}

		media = soma / contador;
		System.out.println("A média das alturas inseridas é " + media);

	}

}
