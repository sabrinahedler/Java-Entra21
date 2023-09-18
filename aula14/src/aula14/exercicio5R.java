package aula14;

public class exercicio5R {

	public static void main(String[] args) {

		// faça um algoritmo que atribua valores ao vetor de acordo com o quadrado do
		// seu indice

		int[] vetor = new int [20];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = i * i;
			System.out.println(vetor[i]);
		}
	}

}
