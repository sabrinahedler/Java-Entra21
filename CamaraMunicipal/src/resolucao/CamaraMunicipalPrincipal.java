package resolucao;

import java.text.DecimalFormat;

public class CamaraMunicipalPrincipal {

	public static void main(String[] args) {

		/*
		 * Escreva um programa Java que leia os dados disponíveis pela Câmara e imprima
		 * o nome, partido e desempenho do vereador.
		 * 
		 * Imprima: a) o total de projetos apresentados e de aprovados na câmara;
		 * 
		 * b) o nome, partido e desempenho do vereador com mais projetos aprovados;
		 * 
		 * c) o nome, partido e desempenho do vereador com menor desempenho;
		 * 
		 * d) o nome, partido e desempenho dos vereadores cujo desempenho seja maior que
		 * o desempenho médio de toda a câmara;
		 */

		DecimalFormat formato = new DecimalFormat("0.00");

		CamaraMunicipal v1 = new CamaraMunicipal("Jose", "PLB", 41, 11);
		CamaraMunicipal v2 = new CamaraMunicipal("Maria", "PL", 24, 6);
		CamaraMunicipal v3 = new CamaraMunicipal("Felipe", "PT", 34, 2);
		CamaraMunicipal v4 = new CamaraMunicipal("Queiroz", "PSB", 52, 43);
		CamaraMunicipal v5 = new CamaraMunicipal("Rosana", "PSDB", 50, 32);
		CamaraMunicipal v6 = new CamaraMunicipal("Paulo", "PDT", 3, 1);
		CamaraMunicipal v7 = new CamaraMunicipal("Cezar", "PV", 22, 5);
		CamaraMunicipal v8 = new CamaraMunicipal("Joao", "PP", 89, 47);
		CamaraMunicipal v9 = new CamaraMunicipal("Carlos", "PSTU", 37, 12);
		CamaraMunicipal v10 = new CamaraMunicipal("Miguel", "PCB", 91, 85);
		CamaraMunicipal v11 = new CamaraMunicipal("Antonio", "DC", 10, 1);
		CamaraMunicipal v12 = new CamaraMunicipal("Jenniffer", "PCO", 2, 2);
		CamaraMunicipal v13 = new CamaraMunicipal("Joaquim", "PSOL", 68, 49);
		CamaraMunicipal v14 = new CamaraMunicipal("Samuel", "PL", 42, 25);
		CamaraMunicipal v15 = new CamaraMunicipal("Nelson", "PMB", 26, 17);

		int contador = 0;
		double somaProjetosApresentados = 0;
		double somaProjetosAprovados = 0;
		double somaDesempenho = 0;
		double media = 0;
		double desempenhoProjetosAprovados = 0;
		double maiorValor = Double.MIN_VALUE;
		double menorValor = Double.MAX_VALUE;
		CamaraMunicipal maiorNumProjetosAprov = null;
		CamaraMunicipal menorDesempenho = null;
		double desempenho = 0;

		for (CamaraMunicipal v : CamaraMunicipal.listaVereadores) {
			v.desempenho();
		}

		for (CamaraMunicipal v : CamaraMunicipal.listaVereadores) {
			somaProjetosApresentados = somaProjetosApresentados + v.getProjetosApresentados();
			somaProjetosAprovados = somaProjetosAprovados + v.getProjetosAprovados();
			somaDesempenho = somaDesempenho + v.desempenho();
			contador++;
			desempenho = (v.getProjetosApresentados() / v.getProjetosAprovados()) * v.indiceTrabalho();

			if (v.getProjetosAprovados() > maiorValor) {
				maiorValor = v.getProjetosAprovados();
				maiorNumProjetosAprov = v;
				desempenhoProjetosAprovados = v.desempenho();
			}

			if (v.desempenho() < menorValor) {
				menorValor = v.desempenho();
				menorDesempenho = v;
			}
		}

		media = somaDesempenho / contador;

		System.out.println("Total de projetos apresentados: " + somaProjetosApresentados);
		System.out.println("Total de projetos aprovados: " + somaProjetosAprovados);
		System.out.println("Vereador com maior numero de projetos aprovados: " + maiorNumProjetosAprov.toString()
				+ " com o desempenho de " + formato.format(desempenhoProjetosAprovados));
		System.out.println("Vereador com menor desempenho: " + menorDesempenho.toString() + " com o desempenho de "
				+ formato.format(menorValor));

		for (CamaraMunicipal v : CamaraMunicipal.listaVereadores) {
			if (v.desempenho() > media) {
				System.out.println("Acima da media: " + v.toString());
			}
		}

	}
}