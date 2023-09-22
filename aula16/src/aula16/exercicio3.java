package aula16;

public class exercicio3 {

	// utilizando o metodo conta(), já criado, quebre o mesmo em dois metodos:
	// soma() e multiplicação()
	// sendo que os nomes das variaveis deve ser igual

	public static void soma() {
		int numUm = 10;
		int numDois = 100;
		System.out.println("Soma: " + (numUm + numDois));
	}

	public static void multiplicacao() {
		int numUm = 10;
		int numDois = 100;
		System.out.println("Multiplicação: " + (numUm * numDois));
	}

	public static void main(String[] args) {
		soma();
		multiplicacao();
	}
}
