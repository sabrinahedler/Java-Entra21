package aeronave;

public class Aeronave {

	/*
	 * Faça uma classe chamada Aeronave. Com os atributos: Passageiros. Velocidade
	 * máxima. Capacidade de combustível. Queima de combustível por minuto.
	 * 
	 * Crie 4 objetos de sua preferência.
	 */

	private String nome;
	private int passageiros;
	private double velocidadeMax;
	private int capacidadeCombustivel;
	private double queimaCombustivelMin;

	public Aeronave(String nome, int passageiros, double velocidadeMax, int capacidadeCombustivel,
			double queimaCombustivelMin) {

		setNome(nome);
		setPassageiros(passageiros);
		setVelocidadeMax(velocidadeMax);
		setCapacidadeCombustivel(capacidadeCombustivel);
		setQueimaCombustivelMin(queimaCombustivelMin);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public double getVelocidadeMax() {
		return velocidadeMax;
	}

	public void setVelocidadeMax(double velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}

	public int getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}

	public void setCapacidadeCombustivel(int capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	}

	public double getQueimaCombustivelMin() {
		return queimaCombustivelMin;
	}

	public void setQueimaCombustivelMin(double queimaCombustivelMin) {
		this.queimaCombustivelMin = queimaCombustivelMin;
	}

	public double tempoNoAr() {
		return capacidadeCombustivel / queimaCombustivelMin;
	}

	public double distanciaMax() {
		return (capacidadeCombustivel / queimaCombustivelMin) * velocidadeMax;
	}

}