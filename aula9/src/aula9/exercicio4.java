package aula9;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// crie uma array de 5 elementos e no momento de imprimir, comece pelo ultimo
		// elemento ate o primeiro elemento

		int elementos[] = new int[5];

		elementos[0] = 1;
		elementos[1] = 2;
		elementos[2] = 3;
		elementos[3] = 4;
		elementos[4] = 5;

		for (int i = 4; i >= 0; i--) {
			System.out.println(elementos[i]);
		}
	}

}
