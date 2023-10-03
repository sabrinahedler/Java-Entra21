package aula20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		// faça um algoritmo que descubra se uma ArrayList possui o número que o usuário
		// entrou
		// imprima também o seu índice

		Scanner scan = new Scanner(System.in);

		List<Integer> lista = new ArrayList<>();
		
		lista.add(23);
		lista.add(4);
		lista.add(45);
		lista.add(10);
		lista.add(19);

		System.out.println("Digite um numero");
		int numero = scan.nextInt();

		int indice = lista.indexOf(numero);
		
		if (indice != -1) {
			System.out.println("o número estava inserido no indice " + indice);
			System.out.println(lista);
		} else {
			System.out.println("o número inserido não está na ArrayList");
			System.out.println(lista);
		}
	}

}
