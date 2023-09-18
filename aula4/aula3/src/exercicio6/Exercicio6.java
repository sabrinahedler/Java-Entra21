package exercicio6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//faça um programa que verifique (usando if e else) 
		//se uma letra digitada é vogal ou consoante
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma letra");
		String letra = teclado.next();
		
		if ( letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			System.out.println("Esta letra é uma vogal");
			
		} else {
			System.out.println("Esta letra é uma consoante");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
