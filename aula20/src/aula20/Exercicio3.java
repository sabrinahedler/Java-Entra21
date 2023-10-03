package aula20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		// crie uma ArrayList onde o usuario vai colocando valores decimais até ele
		// colocar o número 0
		// calcule:
		// a) qual o menor número?
		// b) qual o maior número?
		// c) calcule a media

		Scanner scan = new Scanner(System.in);

		int soma = 0;
		int contador = 0;
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;

		System.out.println("digite qualquer numero para entrar ou 0 para parar");
		int elemento = scan.nextInt();

		List<Integer> lista = new ArrayList<>();

		while (elemento != 0) {
			System.out.println("Digite elementos para a ArrayList");
			elemento = scan.nextInt();
			lista.add(elemento);

			soma = soma + elemento;
			contador++;

			if (elemento > maximo) {
				maximo = elemento;
			}
			if (elemento < minimo) {
				minimo = elemento;
			}
		}

		System.out.println(lista);
		System.out.println("Maior número: " + maximo);
		System.out.println("Menor número: " + minimo);
		System.out.println("Média: " + soma / contador);

	}
}
