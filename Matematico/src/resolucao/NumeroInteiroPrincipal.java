package resolucao;

public class NumeroInteiroPrincipal {

	public static void main(String[] args) {

		NumeroInteiro valor = new NumeroInteiro(12);

		System.out.println(valor.multiplicacao(valor));
		System.out.println(valor.fatorial());
		System.out.println("contador: " + valor.qntDivisores());
		valor.fibonacci();

	}

}
