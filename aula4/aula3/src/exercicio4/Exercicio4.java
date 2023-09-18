package exercicio4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual seu gênero?");
		System.out.println("Digite F para feminino ou M para masculino");
		
		String genero =  teclado.next();
		
		if (genero.equalsIgnoreCase("F")) {
		System.out.println("Feminino");
		
		} else if (genero.equalsIgnoreCase("M")) {
			System.out.println("Masculino");
		
		}
		else {
			System.out.println("Valor inválido.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
