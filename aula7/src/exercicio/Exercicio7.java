package exercicio;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// escreva um programa onde caso o usuario digite a letra "S" peça para informar
		// um numero
		// caso digite "N" encerre o programa e por fim
		// escreva o menor valor
		// escreva o maior valor

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe uma opção");
		char opcao = teclado.next().charAt(0);
		int numero = 0;
		
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;

		while (opcao == 's') {
			System.out.println("Insira um número");
			numero = teclado.nextInt();
	
			if (numero < menor) {
				menor = numero;
			}
			if (numero > maior) {
				maior = numero;
			}
			
			System.out.println("Informe uma opção");
			opcao = teclado.next().charAt(0);
			
			while (opcao != 's' && opcao != 'n') {
				System.out.println("Valor Invalido");
				System.out.println("Informe uma opçao");
				opcao = teclado.next().charAt(0);
			}
		}

		System.out.println("menor " + menor);
		System.out.println("maior " + maior);

	}

}
