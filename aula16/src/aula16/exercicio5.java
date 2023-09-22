package aula16;

public class exercicio5 {
	
	//reutilizar metodo soma, porem passar os dados via parametro

	public static void soma(int numUm, int numDois) {
		System.out.println("Soma: " + (numUm + numDois));
		System.out.println("Multiplicacao: " + (numUm * numDois));
	}
	
	public static void main(String[] args) {
		soma(1,2);
	}
}  