package resolucao;

public class NumeroInteiro {

	/*
	 * Um matemático está necessitando de várias funções relacionadas a um número
	 * inteiro positivo. Suponha a definição de uma classe Inteiro Positivo que
	 * apresenta o seguinte atributo: um número X.
	 * 
	 * Implemente os seguintes métodos:
	 * 
	 * a) um método setValor, que realiza a consistência necessária para garantir
	 * que X seja um inteiro positivo;
	 * 
	 * b) um método para retornar o número X multiplicado por outro objeto de
	 * InteiroPositivo (este outro objeto é o objeto manipulado imediatamente antes
	 * deste);
	 * 
	 * c) um método para calcular o fatorial de X; Fatorial (X) = X * (X-1) * (X-2)
	 * * (X-3) * … * 2 * 1
	 * 
	 * d) um método para identificar os divisores inteiros de X e a quantidade de
	 * divisores. Exemplo: para o número 12, os divisores são 1, 2, 3, 4, 6, 12 e a
	 * quantidade de divisores é 6;
	 * 
	 * e) um método para calcular a série de Fibonacci formada por X elementos;
	 * Fibonacci = 1, 1, 2, 3, 5, 8, 13
	 */

	private int valor;

	public NumeroInteiro(int valor) {
		setValor(valor);
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("invalido, numero não pode ser negativo");
		}
		this.valor = valor;
	}

	public int multiplicacao(NumeroInteiro parametro) {
		return valor * parametro.getValor();
	}

	public int fatorial() {
		int novoValor = valor;
		for (int i = 1; i < valor - 1; i++) {
			novoValor = novoValor * (valor - i);
		}

		return novoValor;
	}

	public int qntDivisores() {
		int contador = 0;
		for (int i = 1; i < valor + 1; i++) {
			if (valor % i == 0) {
				System.out.print(i + ", ");
				contador++;
			}
		}

		return contador;

	}
	
	public void fibonacci() {
		System.out.println("metodo fibonacci:");
		int novoValor = 1;
		int valorAnterior = 1;
		int valorAtual = 0;
		for (int i = 1; i < valor; i++) {
			System.out.println(valorAtual = novoValor + valorAnterior);
			valorAnterior = novoValor;
			novoValor = valorAtual;
		}
	}
}