package resolucao;

import java.util.Scanner;

public class VelocidadeCarroPrincipal {

	public static void main(String[] args) {

		VelocidadeCarro c1 = new VelocidadeCarro("Ferrari", 350.0);
		VelocidadeCarro c2 = new VelocidadeCarro("Bmw", 375.0);
		VelocidadeCarro c3 = new VelocidadeCarro("Fusca", 500.0);

		c1.AcelerarVelocidade(10);

		c2.AcelerarVelocidade(10);

		c3.AcelerarVelocidade(10);

		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
	}

}
