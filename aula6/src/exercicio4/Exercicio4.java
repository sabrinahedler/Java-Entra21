package exercicio4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// crie um programa para ler notas 3 e mostrar a média delas.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Escreva notas");
		double nota;
		double soma = 0;
		double media;
		
		for ( int i = 1 ; i <= 3 ; i++) {
			nota = teclado.nextDouble();
			soma = nota + soma;
			
		} media = soma / 3;
		
		System.out.println("A média das notas é " + media);

	}

}
