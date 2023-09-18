package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Dada a idade de um nadador descreva um algoritmo que o classifique em uma das seguintes categorias:
		//pré-mirim 5-7 anos  mirim 8-10 anos  infantil 11-13 anos    infanto-juvenil 14-17   juvenil 18-20   adulto 21+
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escreva sua idade");
		int idade = teclado.nextInt();
		
		if ( idade < 8) {
			System.out.println("Pré-mirim");
		} else if ( idade >= 8 && idade < 11) {
			System.out.println("Mirim");
		} else if ( idade >= 11 && idade < 14 ) {
			System.out.println("Infantil");
		} else if ( idade >= 14 && idade < 18) {
			System.out.println("Infanto-juvenil");
		} else if ( idade >=18 && idade <21) {
			System.out.println("Juvenil");
		} else {
			System.out.println("Adulto");
		}
			
		
		
		
		
		
		
		
		
		
		
	}

}
