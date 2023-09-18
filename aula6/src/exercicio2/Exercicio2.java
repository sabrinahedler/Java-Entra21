package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// faça um programa, utilizando for, que peça para o usuario inserir
		// um numero N e mostre na tela todos os numeros impares ate N
		

		Scanner teclado = new Scanner(System.in);

		System.out.println("Escreva um número");
		int n = teclado.nextInt();
	
		for (int i = 1; i <= n; i = i + 2 ) {	
			System.out.println("O números ímpares são " + i);
		
		}
		
		
		
		
		
	}

}
