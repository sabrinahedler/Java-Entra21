package exercicio7;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//para doar sangue é necessario ter entre 18 e 67 anos. Faça um programa que pergunte a idade de uma pessoa e diga se ela pode ou não doar sangue.
		// usar || e &&
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua idade:");
		
		int idade = teclado.nextInt();
		
		if ( idade >= 18) {
			System.out.println("Você pode doar sangue.");
		} else if ( idade >=68 || idade <18) {
			System.out.println("Você não pode doar sangue.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
