package aula15;

import java.text.DecimalFormat;

public class exercicio8R {

	public static void main(String[] args) {

		//chico tem 1,50 de altura e cresce 2 cm por ano, enquanto zé tem 1,10 e cresce 3 cm por ano
		//construa um algoritmo que calcule e imprima quantos anos serão necessários para que zé seja maior que chico
		
		DecimalFormat format = new DecimalFormat("0.00");
		
		double chico = 1.50;
		double ze = 1.10;
		
		int contador = 0;
		
		while ( ze < chico) {
				chico = chico + 0.02;
				ze = ze + 0.03;
				contador++;
		}
		
		System.out.println("Em " + contador + " anos ze será maior que chico");
		System.out.println("ze terá " + format.format(ze) + " enquando chico tera " + format.format(chico));
		
	}

}
