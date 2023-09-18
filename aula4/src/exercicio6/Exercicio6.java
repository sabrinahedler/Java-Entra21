package exercicio6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Faça o algoritmo dizer qual pessoa é a mais velha do meio e nova
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a idade de Marquinhos, Zezinho e Luluzinha, assim sucessivamente");
		int mar = teclado.nextInt();
		int zez = teclado.nextInt();
		int lul = teclado.nextInt();
		
		String velho = "";
		String novo = "";
		String meio = "";
		
		if ( mar > zez && mar > lul) {
			velho = "Marquinhos";
		} else if ( zez > lul) {
			velho = "Zezinho";
		} else {
			velho = "Luluzinha";
		} 
		
		System.out.println("O irmão mais velho é " + velho);
		
		if  ( mar < zez && mar < lul) {
			novo = "Marquinhos";
		} else if  ( zez < lul) {
			novo = "Zezinho";
		} else { 
			novo = "Luluzinha";
		}
		
		System.out.println("O irmão mais novo é " + novo);
		
		
		
		
		
	}

}
