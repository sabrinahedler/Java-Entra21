package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crie 4 variaveis fora do for onde define se é M -muie e H-home
		// e faça dois contador que verifique quantas mulheres e homens são

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Inform 4  valores, sendo m(mulher) e h(homem)");
		int mulher = 0;
		int homem = 0;
		
		for (int i = 0; i <4; i++) {
		String val = teclado.next();
		if (val.equals("m")) {
			mulher++;
		} else {
			homem++;
		}
		}
		
		System.out.println("Mulheres: " + mulher);
		System.out.println("Homens: " + homem);
		
	}

}
