package aula20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		// descreva um algoritmo que leia 6 valores reais e os coloque em uma ArrayList
		// imprima quais valores desses informados são maiores que a média dos valores

		Scanner scan = new Scanner(System.in);
		int valor = 0;
		int soma = 0;
		int contador = 0;
		
		List<Integer> lista = new ArrayList<>();

		System.out.println("Insira 6 valores reais");
		for (int i = 0; i < 6; i++) {
			valor = scan.nextInt();
			lista.add(valor);
			soma = soma + valor;
			contador++;
		}
		
		for (int i = 0; i < contador; i++) {
			if ( lista.get(i) > soma / contador) {
				System.out.println(lista.get(i));
			}
		}

	}
}
