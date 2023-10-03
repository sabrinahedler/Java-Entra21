package funcoes;

import java.util.Scanner;

public class execicio1 {
	
	/*
	 * Faça um programa que diz se um número inserido está dentro de um limite
	 * imposto pelo usuário
	 * 
	 * Por exemplo:
	 * 
	 * Usuário inseriu o limite máximo como 100. Usuário inseriu o limite mínimo
	 * como 70.
	 * 
	 * Depois ele inseriu o número 80.
	 * 
	 * A saída deve ser: 80 está nos limites impostos.
	 */
	
	public static String verificacao (int numero, int max, int min) {
		if (numero > max && numero < min) {
			return numero + " está nos limites impostos";
		} else {
			return numero + " não está nos limites impostos";
		}
		
	}

	public static void main(String[] args) {
		System.out.println(verificacao(80, 70, 100));
	}

}
