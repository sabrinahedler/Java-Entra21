package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Em qual turno você estuda?");
		System.out.println("Digite M para matutino, V para vespertino ou N para noturno:");
		
		String turno =  teclado.next();
		
		if (turno.equalsIgnoreCase("M")) {
		System.out.println("Bom dia!");
		
		} else if (turno.equalsIgnoreCase("V")) {
			System.out.println("Boa tarde!");
			
		}  else if (turno.equalsIgnoreCase("N")) {
		
		}
		else {
			System.out.println("Valor inválido.");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
