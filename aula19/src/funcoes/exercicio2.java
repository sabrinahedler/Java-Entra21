package funcoes;

import java.util.Scanner;

public class exercicio2 {

	/*
	 * Faça um código que receba duas entradas do usuário
	 * 
	 * Printe cada entrada ao cubo se: Algum dos dois números for 5 A soma deles é 5
	 * A diferença deles é 5
	 * 
	 * Se nenhuma dessas condições forem satisfeitas, printe cada entrada ao
	 * quadrado
	 */

	public static int calculo(int numUm, int numDois) {

		int diferenca = Math.abs(numUm - numDois);

		if (numUm == 5 || numDois == 5) {
			return (numUm + numDois) * 3;
			
		} else if (numUm + numDois == 5) {
			return (numUm + numDois) * 3;
			
		} else if (diferenca == 5) {
			return (numUm + numDois) * 3;
		}
		
		return (numUm * numDois) * 2;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe 2 numeros");
		int numUm = teclado.nextInt();
		int numDois = teclado.nextInt();

		System.out.println(calculo(numUm, numDois));
	}

}
