package aula16;

public class MetodoComParametro {

	//metodo com parametro

	public static void metodoComParametro(String nome) {
		System.out.println("Meu nome: " + nome);
	}

	public static void metodoComMaisParametros(int idadeUm, int idadeDois, String texto) {
		System.out.println("A soma das idades: " + (idadeUm + idadeDois));
		System.out.println("E o texto: " + texto);
	}

	public static void main(String[] args) {
		String nome = "sabrina";
		metodoComParametro(nome);
		metodoComParametro("maria");

		metodoComMaisParametros(15, 19, "alfredo");
	}

}