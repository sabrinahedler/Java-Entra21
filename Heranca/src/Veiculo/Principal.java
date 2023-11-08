package Veiculo;

public class Principal {

	public static void main(String[] args) {
		
		Bicicleta b1 = new Bicicleta("Teste", 5, 5, 10, 1, false);
		
		System.out.println(b1.verificaLimite(2));
		
	}

}
