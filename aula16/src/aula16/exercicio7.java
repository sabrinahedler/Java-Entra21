package aula16;

import java.util.Scanner;

public class exercicio7 {

	// faça um método para cada um dos seu colegas
	// o método deve printar:
	// o nome dele é [nome]
	// ele tem [idade] anos
	// ele é estudante do entra21
	// o usuario deve entrar com um valor que vai selecionar um dos métodos a ser
	// executado

	public static void amigos (String nome, int idade) {
		
		System.out.println("O nome dele é " + nome);
		System.out.println("Ele tem " + idade + " anos");
		System.out.println("Ele é estudante do entra21");
		
	}
	

	public static void main(String[] args) {
	amigos("alfredo", 16);
	amigos("joserico", 20);
	amigos("pedro", 23);
		
		
	}

}
