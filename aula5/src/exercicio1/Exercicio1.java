package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// calculadora com switch
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite dois números");
		double num1 = teclado.nextDouble();
		double num2 = teclado.nextDouble();

		System.out.println("Digite o número da operação desejada");
		System.out.println("Sendo 1-soma, 2-subtração, 3-multiplicação, 4-divisão");
		int operacao = teclado.nextInt();

		// variavel auxiliar
		double variavelAuxiliar = 0;

		switch (operacao) {
		case 1:
			variavelAuxiliar = num1 + num2;
			break;
		case 2:
			variavelAuxiliar = num1 - num2;
			break;
		case 3:
			variavelAuxiliar = num1 * num2;
			break;
		case 4:
			variavelAuxiliar = num1 / num2;
			break;
		default:
			System.out.println("Invalido."); 
			break;
		}
		
		System.out.println("O resultado é " + variavelAuxiliar);

		
		
		
		
		
		
		
		
		
		
	}

}
