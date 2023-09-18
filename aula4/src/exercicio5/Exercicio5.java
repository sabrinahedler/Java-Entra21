package exercicio5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres
		// calcule e escreva a soma das idades do homem mais velho com a mulher mais
		// nova
		// e o produto das idades do homem mais novo com a mulher mais velha

		Scanner teclado = new Scanner(System.in);
		System.out.println("Escreva a idade de 2 homens");
		int idadeh1 = teclado.nextInt();
		int idadeh2 = teclado.nextInt();

		System.out.println("Escreva a idade de 2 mulheres");
		int idadem1 = teclado.nextInt();
		int idadem2 = teclado.nextInt();

		int produto = 0;
		int soma = 0;
		int homemV = 0;
		int homemN = 0;
		int mulherV = 0;
		int mulherN = 0;

		if (idadeh2 > idadeh1) {
			homemV = idadeh2;
			homemN = idadeh1;
		} else {
			homemV = idadeh1;
			homemN = idadeh2;
		}

		produto = homemN * mulherV;
		soma = homemV * mulherN;

		if (idadeh1 > idadeh2 && idadem1 > idadem2) {
			soma = idadeh1 + idadem2;
			produto = idadeh2 * idadem1;

		} else if (idadeh2 > idadeh1 && idadem1 > idadem2) {
			soma = idadeh2 + idadem2;
			produto = idadeh1 * idadem1;
		} else if (idadeh1 > idadeh2 && idadem2 > idadem1) {
			soma = idadeh1 + idadem1;
			produto = idadeh2 * idadem2;
		} else {
			soma = idadeh2 + idadem1;
			produto = idadeh1 * idadem2;
		}

		System.out.println("A soma " + soma);
		System.out.println("O produto " + produto);
	}

}
