package aula20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		// faça um algoritmo que coloque o número 0 no índice que o usuário escolheu
		
		Scanner scan = new Scanner(System.in);
		
		int elemento = 0;
		
		List<Integer> lista = new ArrayList<>();
		
		System.out.println("Digite um indice de 0 á 10");
		int numero = scan.nextInt();
		
		for (int i = 0; i < 11; i++) {
			elemento = i * i;
			lista.add(elemento);
		}
		
		lista.set(numero, 0);
		
		System.out.println(lista);
		
	}

}
