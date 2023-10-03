package funcoes;

public class funcoes {
	// fórmula: p. s. tipo nome () {}
	public static String imprimirNome() {
		// dentro do escopo, agora temos um retorno
		// sempre crie uma variavel
		String nome = "Sabrina";
		return nome;
	}

	public static double soma(double numUm, double numDois) {

		double soma = numUm + numDois;
		return soma;
	}

	// metodo main por ultimo
	public static void main(String[] args) {
		System.out.println(imprimirNome());
		System.out.println(soma(10.5, 25.5));

	}

}
