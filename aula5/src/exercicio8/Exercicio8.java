package exercicio8;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// descreva um algoritmo que calcule e escreva a soma dos 
		// números pares e a soma dos números ímpares entre 1 e 1000
		
		Scanner teclado = new Scanner(System.in);
		int par = 0;
		int impar = 0;
		
		for (int i = 1; i <= 1000; i ++ ) {	
			if ( i %2 == 0 ) {
				par = par + i;
			} else {
				impar = impar + i;
			}
		
		}
		
		System.out.println("A soma dos impares é " + impar);
		System.out.println("A soma dos pares é " + par);
		
		
	}

}
