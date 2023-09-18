package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Escreva um algoritmo para ler que ano de nascimento de 3 irmãos
		// escreva uma mensagem que indique se eles são trigêmeos, gêmeos ou apenas
		// irmãos

		Scanner teclado = new Scanner(System.in);

		System.out.println("Escreva 3 anos de nascimento do irmão 1 ");
		int ano1 = teclado.nextInt();
		int ano2 = teclado.nextInt();
		int ano3 = teclado.nextInt();

		
		if ( ano1 == ano2 && ano2 == ano3 ) {
			System.out.println("Eles são trigêmeos");
		} else if ( ano1 == ano2 ) {
			System.out.println("Irmão 1 e 2 são gêmeos e 3 é apenas irmão");
		} else if ( ano2 == ano3) {
			System.out.println("Irmão 3 e 2 são gêmeos e 1 é apenas irmão");
		} else if ( ano1 == ano3) {
			System.out.println("Irmão 1 e 3 são gêmeos e 2 é apenas irmão");
		} else {
			System.out.println("Eles são apenas irmãos");
		}
		
		
		
		
	}

}
