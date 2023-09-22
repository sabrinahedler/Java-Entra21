package aula16;

public class exercicio10 {

	//faça um programa que calcule o perímetro e a área de um retangulo
	//passe a altura e a largura como parâmetros da função
	
	public static void retangulo(int altura, int largura) {
		System.out.println("Area: " + altura * largura );
		System.out.println("Perimetro: " + (altura + largura) * 2);
	}
	
	public static void main(String[] args) {
		retangulo(2,4);
	}

}
