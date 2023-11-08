package resolucao;

import java.util.ArrayList;
import java.util.List;

public class PrincipalFloricultura {

	public static void main(String[] args) {

		/*
		 * Crie 5 objetos de flor e as coloque em uma Array List Responda: a) Quem
		 * comprou a flor mais cara? b) Qual o nome da flor mais cara?
		 */

		Floricultura f1 = new Floricultura("rosa", 15.99, "Marcio", "Sim");
		Floricultura f2 = new Floricultura("tulipa", 58.50, "Elena", "Não");
		Floricultura f3 = new Floricultura("girassol", 19.99, "Jose", "Não");
		Floricultura f4 = new Floricultura("cravo", 45.00, "Fernanda", "Sim");
		Floricultura f5 = new Floricultura("orquidea", 89.99, "Henrique", "Não");

		double florCara = Integer.MIN_VALUE;
		String clienteFlorCara = "";

		for (Floricultura f : Floricultura.listaFlores) {
			if (f.getPreco() > florCara) {
				florCara = f.getPreco();
				clienteFlorCara = f.toString();
			}
		}
		
		System.out.println(clienteFlorCara.toString());

	}
}