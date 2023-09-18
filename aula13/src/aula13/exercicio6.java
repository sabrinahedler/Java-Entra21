package aula13;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// crie uma matriz onde o usuário define quantas linhas e colunas deve ter e
		// depois imprima o total de elementos que ela tem

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite uma quantidade de linhas");
		int qntLinhas = teclado.nextInt();

		System.out.println("Digite uma quantidade de colunas");
		int qntColunas = teclado.nextInt();

		int soma = qntLinhas * qntColunas;
		
		System.out.println("A quantidade de elementos da matriz é: " + soma);
	}

}
