package Veiculo;

public class Aviao extends Veiculo {
	
	// aviao = classe filho
	int numMotores;
	int numAsas;
	
	public Aviao(String modelo, double peso, double comprimento, double velMax, int passageiro, int numMotores,
			int numAsas) {
		super(modelo, peso, comprimento, velMax, passageiro);
		this.numMotores = numMotores;
		this.numAsas = numAsas;
	}
	
	


	

}
