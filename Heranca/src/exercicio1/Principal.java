package exercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Cilindro c1 = new Cilindro("amarelo", 1.5, 2.0);
		Circulo c2 = new Circulo("vermelho", 2.0);
		
		System.out.println(c1.toString());
		System.out.println("Volume cilindro: " + c1.calcularVolume());
		System.out.println("Area cilindro: " + c1.calcularArea());
		
		System.out.println(" ");
		
		System.out.println(c2.toString());
		System.out.println("Area circulo: " + c2.calcularArea());

	}
}
