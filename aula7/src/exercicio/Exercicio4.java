package exercicio;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// descreva um algoritmo que vá lendo a altura de pessoas até o usuário entrar
		// com o número 0
		// calcule a média de altura das mesmas

		Scanner teclado = new Scanner(System.in);
		double soma = 0;
		double media = 0;
		int contador = 0;

		System.out.println("Escreva alturas humanas diferentes");
		double altura = teclado.nextDouble();

		while (altura != 0) {
			soma = soma + altura;
			contador++;
			altura = teclado.nextDouble();

		}
		media = soma / contador;
		System.out.println("A média das alturas são " + media);

	}

}
