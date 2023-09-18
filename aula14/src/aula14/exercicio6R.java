package aula14;

import java.util.Scanner;

public class exercicio6R {

	public static void main(String[] args) {

		//descreva m algoritmo que leia 12 valores decimais e os coloque em um vetor de 12 posições
		//em seguida, modifique o vetor de modo que os valores das POSIÇÕES ímpares sejam aumentadas em 5% e os pares em 2%
		//imprima o vetor resultante
		
		Scanner teclado = new Scanner(System.in);
		
		double[] vetor = new double [12];
		
		System.out.println("Digite 12 valores decimais");
		for (int i = 0; i < vetor.length; i++) {
			vetor [i] = teclado.nextInt();
			
			if (vetor[i] % 2 == 0 ) {
				vetor[i] = vetor[i] * 1.02;
			} else {
				vetor[i] = vetor[i] * 1.05;
			}
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
	}

}
