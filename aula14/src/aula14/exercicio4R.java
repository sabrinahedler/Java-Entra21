package aula14;

public class exercicio4R {

	public static void main(String[] args) {

		// crie uma array de 5 elementos e descubra
		// a. qual o maior elemento
		// b. qual o menor elemento
		// c. a media dos elementos

		int[] vetor = { 1, 2, 3, 4, 5 };

		double soma = 0;
		double media = 0;
		double contador = 0;
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;

		for (int i = 0; i < vetor.length; i++) {
			soma = soma + vetor[i];
			contador++;

			if (vetor[i] < menor) {
				menor = vetor[i];
			}
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}

		media = soma / contador;

		System.out.println("O maior valor é: " + maior);
		System.out.println("O menor valor é: " + menor);
		System.out.println("A media dos valores é: " + media);
	}

}
