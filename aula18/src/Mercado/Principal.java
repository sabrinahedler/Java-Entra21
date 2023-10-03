package Mercado;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Calcule: a) Quem teve o maior lucro vendendo maçãs? b) Quem teve o maior
		 * lucro vendendo laranjas? c) Qual das lojas teve o maior lucro nesse ano
		 * específico? d) Qual das lojas teve o menor lucro? e) Qual das lojas ficou no
		 * "meio" em termos de lucro? f) Juntando as 3 lojas, a franquia teve um lucro
		 * maior vendendo maçãs ou laranjas?
		 */

		Mercado unidadeBlumenau = new Mercado("Blumenau", 2000, 2.00, 3000, 3.00);
		Mercado unidadeFlorianopolis = new Mercado("Floripa", 5000, 1.00, 2500, 3.50);
		Mercado unidadeJoinville = new Mercado("Joinville", 3000, 1.50, 1500, 2.00);

		Mercado vetor[] = new Mercado[3];
		vetor[0] = unidadeBlumenau;
		vetor[1] = unidadeFlorianopolis;
		vetor[2] = unidadeJoinville;

		String locMaiorLucroTotal = "";
		String locMenorLucroTotal = "";
		String locMaiorLucroMaca = "";
		String locMaiorLucroLaranja = "";
		String locMeio = "";
		String maiorLucro = "";
		double somaUm = 0;
		double somaDois = 0;
		double valorMaisAltoMacas = Integer.MIN_VALUE;
		double valorMaisAltoLaranjas = Integer.MIN_VALUE;
		double valorMaisAlto = Integer.MIN_VALUE;
		double valorMaisBaixo = Integer.MAX_VALUE;
		double valorMeio = Integer.MIN_VALUE;

		double lucroFrutas = 0;

		// For para descobrir o menor e maior lucro
		for (int i = 0; i < vetor.length; i++) {
			lucroFrutas = vetor[i].lucroMacas() + vetor[i].lucroLaranja();
			if (vetor[i].lucroMacas() > valorMaisAltoMacas) {
				valorMaisAltoMacas = vetor[i].lucroMacas();
				locMaiorLucroMaca = vetor[i].getLocalidade();
			}

			if (vetor[i].lucroLaranja() > valorMaisAltoLaranjas) {
				valorMaisAltoLaranjas = vetor[i].lucroLaranja();
				locMaiorLucroLaranja = vetor[i].getLocalidade();
			}

			if (vetor[i].lucroTotal() > valorMaisAlto) {
				valorMaisAlto = vetor[i].lucroTotal();
				locMaiorLucroTotal = vetor[i].getLocalidade();
			}
			if (vetor[i].lucroTotal() < valorMaisBaixo) {
				valorMaisBaixo = vetor[i].lucroTotal();
				locMenorLucroTotal = vetor[i].getLocalidade();
			}
			somaUm = somaUm + vetor[i].lucroLaranja();
			somaDois = somaDois + vetor[i].lucroMacas();
		}

		for (int i = 0; i < vetor.length; i++) {
			if (lucroFrutas > valorMeio && lucroFrutas < valorMaisAlto) {
				valorMeio = lucroFrutas;
				locMeio = vetor[i].getLocalidade();
			}
		}

		if (somaUm > somaDois)

		{
			maiorLucro = "Laranjas";
		} else {
			maiorLucro = "Maças";
		}

		System.out.println(locMaiorLucroMaca + " vendeu mais macas");
		System.out.println(locMaiorLucroLaranja + " vendeu mais laranjas");
		System.out.println("Unidade com maior lucro total: " + locMaiorLucroTotal);
		System.out.println("Unidade com menor lucro total: " + locMenorLucroTotal);
		System.out.println(locMeio + " vendeu meio");
		System.out.println("A franquia obteve mais lucro vendendo " + maiorLucro);

	}

}