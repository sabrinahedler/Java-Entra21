package imposto;

import aeronave.Aeronave;

public class Principal {

	/*
	 * Crie 5 objetos da classe Contribuinte e coloque-os em um vetor.
	 * 
	 * Calcule: a) Quem mais paga imposto? b) Quem menos paga imposto? c) Qual o
	 * total de imposto pago entre os 5 contribuintes?
	 */

	public static void main(String[] args) {

		Contribuinte um = new Contribuinte("Paulo", "567.798.665-00", "RJ", 1200);

		Contribuinte dois = new Contribuinte("Maria", "345.776.888-23", "MG", 10000);

		Contribuinte tres = new Contribuinte("Jose", "223.111.456-45", "SC", 3000);

		Contribuinte quatro = new Contribuinte("Douglas", "668.999.675-02", "PR", 4000);

		Contribuinte cinco = new Contribuinte("Fernanda", "887.755.097-11", "SC", 5000);

		Contribuinte vetor[] = new Contribuinte[5];
		vetor[0] = um;
		vetor[1] = dois;
		vetor[2] = tres;
		vetor[3] = quatro;
		vetor[4] = cinco;

		double maximo = Integer.MIN_VALUE;
		double minimo = Integer.MAX_VALUE;
		int contribuinteMaior = 0;
		int contribuinteMenor = 0;
		double total = 0;

		for (int i = 0; i < vetor.length; i++) {
			total = total + vetor[i].imposto();
			if (vetor[i].imposto() > maximo) {
				maximo = vetor[i].imposto();
				contribuinteMaior = i;
			}
			if (vetor[i].imposto() < minimo) {
				minimo = vetor[i].imposto();
				contribuinteMenor = i;
			}
		}

		System.out.println(vetor[contribuinteMaior].getNome() + " é quem paga mais impostos");
		System.out.println(vetor[contribuinteMenor].getNome() + " é quem paga menos impostos");
		System.out.println("Total de impostos arrecadados: " + total);
	}

}
