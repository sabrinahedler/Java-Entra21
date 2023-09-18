package exercicio;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// faça um programa que peça ao usuário um número entre 12 e 20.
		// se digitar um número diferente, mostrar a mensagem "entrada invalida" e
		// solicitar novamente.
		// se digitar o número correto repeti-lo

		Scanner teclado = new Scanner(System.in);
  
		System.out.println("Digite um número entre 12 e 20");
		int valor = teclado.nextInt();

		while (valor < 12 || valor > 20) {
			System.out.println("Invalído, tente novamente");
			valor = teclado.nextInt();
		}
		System.out.println("Correto " + valor);

	}
}
