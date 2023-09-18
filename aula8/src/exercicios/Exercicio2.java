package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		// faça um programa que leia um nome de usuario e a sua senha e não aceite a
		// senha igual ao nome do usuario
		// mostrando uma mensagem de erro e voltando a pedir as informações, caso seja
		// certo, de os parabens e encerre o programa

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o nome de usuario:");
		String usuario = teclado.next();
		System.out.println("Digite sua senha");
		String senha = teclado.next();

		while (usuario.equals(senha)) {
			System.out.println("Usuario ou senha incorretos, tente novamente.");
			System.out.println("Digite o nome de usuario:");
			usuario = teclado.next();
			System.out.println("Digite sua senha");
			senha = teclado.next();
		}
		System.out.println("Correto. Parabens!");
	}

}
