package exercicio5;

import java.util.Scanner;
																					
public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua média");
		double media = teclado.nextInt();
		
		System.out.println("Digite sua frequencia");
		int frequencia = teclado.nextInt();
		 
		 if ( media < 7 || frequencia < 75 ) {
			System.out.println("Reprovado");
		} 
		else {
			System.out.println("Aprovado");
		}
		
		                                 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
