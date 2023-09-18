package exercicio7;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//escreva um algoritmo que leia 5 numeros inteiros e escreva, para cada
		// numero lido, e o mesmo é par ou ímpar
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escreva 5 números");
		for (int i = 0; i < 5; i ++ ) {
			int numero = teclado.nextInt();
			
			
			if ( numero %2 == 0) {
				 System.out.println("O número digitado é  par");
			} else {
				
				 System.out.println("O número digitado é ímpar");
			} 
			} System.out.println("cabosse");
	
			
			
		}
		
		
	}


