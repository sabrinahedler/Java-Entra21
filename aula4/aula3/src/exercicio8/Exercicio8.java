package exercicio8;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// faça um programa que pergunte o preço de 3 produtos e informe qual 
		//produto você deve comprar, sabendo que a decisão é sempre o mais barato
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o preço de 3 produtos");
		
		double produto1 = teclado.nextDouble();
		double produto2 = teclado.nextDouble();
		double produto3 = teclado.nextDouble();
		
		if ( produto1 < produto2 && produto1 < produto3) {
			System.out.println("O mais barato é o produto 1");
		} else if ( produto2 < produto1 && produto2 < produto3) {
			System.out.println("O mais barato é o produto 2");
		} else {
			System.out.println("O mais barato é o produto 3");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
