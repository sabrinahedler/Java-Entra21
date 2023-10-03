package aula20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		// faça um programa para ler os valores de duas ArrayLists
		// crie uma terceira ArrayList em cada elemento é a soma dos valores contidos
		// nas posições respectivas das ArrayLists originais
		// exemplo:
		// ArrayList1 = [1,2,3]
		// ArrayList2 = [1,5,6]
		// ArrayList1 = [2,7,9]
		// exiba, ao final, as três ArrayLists na tela

		Scanner scan = new Scanner(System.in);

		int numeroUm = 0;
		int numeroDois = 0;
		int numeroTres = 0;

		List<Integer> listaUm = new ArrayList<>();
		List<Integer> listaDois = new ArrayList<>();
		List<Integer> listaTres = new ArrayList<>();

		System.out.println("Informe 10 valores para as ArrayLists");
		for (int i = 0; i < 5; i++) {
			numeroUm = scan.nextInt();
			listaUm.add(numeroUm);
			numeroDois = scan.nextInt();
			listaDois.add(numeroDois);
			listaTres.add(numeroUm + numeroDois);
		}

		System.out.println(listaUm);
		System.out.println(listaDois);
		System.out.println(listaTres);
	}
}
