package funcoes;

public class exercicio3 {

	// Faça um programa que calcule o perímetro e a área de um retângulo.
	// Retornar os valores calculados

	public static int area(int altura, int largura) {
		int area = altura * largura;
		int perimetro = (altura * largura) * 2;

		return area;
	}

	public static int perimetro(int altura, int largura) {
		int perimetro = (altura * largura) * 2;

		return perimetro;
	}

	public static void main(String[] args) {
		System.out.println(area(2, 4));
		System.out.println(perimetro(2, 4));

	}

}
