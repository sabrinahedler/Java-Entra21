package aula16;

public class exercicio8 {

	// faça um programa que some 4 números
	// passando esses 4 números como parâmetros para um método

	public static void soma(int numUm, int numDois, int numTres, int numQuatro) {
		int soma = numUm + numDois + numTres + numQuatro;
		System.out.println("Soma: " + soma);
	}

	public static void main(String[] args) {
		soma(20, 10, 40, 30);
	}

}
