package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("Escreva 1 números de 1 á 3");
		int numero1 = teclado.nextInt();
		System.out.println("Escreva 1 números de 1 á 3");
		int numero2 = teclado.nextInt();
		System.out.println("Escreva 1 números de 1 á 3");
		int numero3 = teclado.nextInt();
		
	
		if (numero1 == 1 && numero2 == 1 && numero3 == 1) {
			System.out.println("NOVE");
		} else if (numero1 < 4 && numero2 < 4 || numero3 < 4 && numero1 < 4 || numero2 < 4 && numero3 < 4) {
			System.out.println("SEIS");
		
		}else if (numero1 == 1 || numero1 == 2 || numero1 == 3 || numero2 == 1 || numero2 == 2 || numero2 == 3 || numero3 == 1 || numero3 == 2 || numero3 == 3) {
			System.out.println("TRUCO");
		 
		} 
		 else {
			System.out.println("...");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
