package aula10;

import java.util.Arrays;

public class desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// faça um algoritmo que inverta a ordem de array
		// primeiro vira o último

		char[] vetor = { 'A', 'B', 'C', 'D', 'E' };

		int tamanho = vetor.length - 1;
		char temp = ' ';

		System.out.println(Arrays.toString(vetor));
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = vetor[tamanho];

			vetor[tamanho] = temp;
			tamanho--;
			i++;
		}

		System.out.println(Arrays.toString(vetor));
	}

}
