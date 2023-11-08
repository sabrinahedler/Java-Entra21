package exercicio1;

public class Cilindro extends Circulo {

	private  double altura;

	public Cilindro(String cor, double raio, double altura) {
		super(cor, raio);
		setAltura(altura);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura < 0) {
			throw new IllegalArgumentException("inválido, não pode ser negativo");
		}
		this.altura = altura;
	}

	public double calcularVolume() {
		return 3.14 * (this.getRaio() * 2) * altura;
	}
	
	@Override
	public String toString () {
		return super.toString() + " e altura " + this.altura;
	}
}
