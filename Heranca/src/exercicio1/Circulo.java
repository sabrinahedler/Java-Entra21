package exercicio1;

public class Circulo {

	private String cor;
	private double raio;

	public Circulo(String cor, double raio) {
		super();
		setCor(cor);
		setRaio(raio);
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		if (cor == null && cor.isBlank()) {
			throw new IllegalArgumentException("inválido, não pode ser nulo");
		}
		
		this.cor = cor;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		if (raio < 0) {
			throw new IllegalArgumentException("inválido, não pode ser negativo");
		}
		this.raio = raio;
	}

	public double calcularArea() {
		return 3.14 * (raio * 2);
	}
	
	@Override
	public String toString() {
		return "Circulo de cor " + this.cor + " e raio " + this.raio;
	}
	
}