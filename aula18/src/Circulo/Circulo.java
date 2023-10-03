package Circulo;

public class Circulo {

	/*
	 * Crie uma classe chamada Circulo que tenha o atributo raio
	 * 
	 * Calcule a área de 5 objetos diferentes de Circulo
	 * 
	 * Para obter o valor de PI, use a função Math.PI do Java
	 */

	double raio;

	public double calcularArea() {
		return Math.PI * (raio * raio);
		
	}

	public Circulo(double raio) {
		this.raio = raio;
	}
}
