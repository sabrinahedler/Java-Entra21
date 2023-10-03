package aula20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		// faça um algoritmo em que o usuário insere um número em um índice específico
		// que ele mesmo informou

		Scanner scan = new Scanner(System.in);

		int elemento = 0;

		List<Integer> lista = new ArrayList<>();

		System.out.println("Digite um valor");
		int valor = scan.nextInt();
		
		System.out.println("Digite um índice");
		int indice = scan.nextInt();

		for (int i = 0; i < 11; i++) {
			elemento = i * i;
			lista.add(elemento);
		}

		lista.set(indice, valor);

		System.out.println(lista);

	}

}
