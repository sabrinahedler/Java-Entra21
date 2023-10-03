package aeronave;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Calcule: a) Qual das aeronaves pode ficar no ar por mais tempo? b) Qual
		 * aeronave leva o maior número de passageiros? c) Considerando que os aviões
		 * estão em velocidade máxima, qual deles consegue voar mais longe?
		 */

		Aeronave aviao = new Aeronave("aviao", 100, 200.0, 500, 0.5);

		Aeronave helicoptero = new Aeronave("helicoptero", 5, 500.0, 100, 1.0);

		Aeronave dirigivel = new Aeronave("dirigivel", 10, 70.0, 150, 2.0);

		Aeronave jato = new Aeronave("jato", 4, 500.0, 750, 1.5);

		Aeronave vetor[] = new Aeronave[4];
		vetor[0] = aviao;
		vetor[1] = helicoptero;
		vetor[2] = dirigivel;
		vetor[3] = jato;

		double maximo = Integer.MIN_VALUE;
		double minimo = Integer.MAX_VALUE;
		int aeronaveMaisTempoAr = 0;
		int aeronavePassageiros = 0;
		int aeronaveDistancia = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].tempoNoAr() > maximo) {
				aeronaveMaisTempoAr = i;
			}
			if (vetor[i].getPassageiros() > maximo) {
				maximo = vetor[i].getPassageiros();
				aeronavePassageiros = i;
			}
			if (vetor[i].distanciaMax() > maximo) {
				aeronaveDistancia = i;
			}
		}

		System.out.println("Mais tempo no ar: " + vetor[aeronaveMaisTempoAr].getNome());
		System.out.println("Mais passageiros: " + vetor[aeronavePassageiros].getNome());
		System.out.println("Alcança maior distancia: " + vetor[aeronaveDistancia].getNome());
	}
}