package Veiculo;

public class Veiculo {
// veiculo == classe pai ou super class

	// private o filho precisa de get e set
	private String modelo;
	// protected o filho ainda consegue usar sem estar encapsulado
	private double peso;
	private double comprimento;
	private double velMax;
	private int passageiro;

	public Veiculo(String modelo, double peso, double comprimento, double velMax, int passageiro) {
		this.modelo = modelo;
		this.peso = peso;
		this.comprimento = comprimento;
		this.velMax = velMax;
		this.passageiro = passageiro;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getVelMax() {
		return velMax;
	}

	public void setVelMax(double velMax) {
		this.velMax = velMax;
	}

	public int getPassageiros() {
		return passageiro;
	}

	public void setPassageiros(int passageiros) {
		this.passageiro = passageiros;
	}

	public String verificaLimite(int passageiros) {
		if (passageiros > passageiro) {
			return "Passou do limite";
		} else {
			return "Não passou do limite";
		}
	}

}
