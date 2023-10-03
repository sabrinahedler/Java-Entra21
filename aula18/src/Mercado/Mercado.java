package Mercado;

public class Mercado {

	/*
	 * Crie uma classe denominada Mercado.
	 * 
	 * Essa classe terá 4 atributos, as informações que deverão ser guardadas são:
	 * Número de maçãs vendidas por ano. Preço de venda das maçãs. Número de
	 * laranjas vendidas por ano. Preço de venda das laranjas.
	 * 
	 * Crie 3 objetos da classe Mercado chamados:
	 * 
	 * unidadeDeBlumenau unidadeDeJoinville unidadeDeFlorianopolis
	 */

	private String localidade;
	private int macasVendidas;
	private double precoMacas;
	private int laranjasVendidas;
	private double precoLaranjas;

	public Mercado(String localidade, int macasVendidas, double precoMacas, int laranjasVendidas,
			double precoLaranjas) {

		setLocalidade(localidade);
		setMacasVendidas(macasVendidas);
		setPrecoMacas(precoMacas);
		setLaranjasVendidas(laranjasVendidas);
		setPrecoLaranjas(precoLaranjas);
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		if (localidade.isBlank() || localidade.isEmpty() || localidade == null) { // Fazendo a validacao de string
			System.out.println("Erro, nome invalido");
		} else {
			this.localidade = localidade;
		}
	}

	public int getMacasVendidas() {
		return macasVendidas;
	}

	public void setMacasVendidas(int macasVendidas) {
		if (macasVendidas < 0) {
			System.out.println("Erro, numero nao pode ser negativo");
		} else {
			this.macasVendidas = macasVendidas;
		}
	}

	public double getPrecoMacas() {
		return precoMacas;
	}

	public void setPrecoMacas(double precoMacas) {
		if (precoMacas < 0) {
			System.out.println("Erro, preco nao pode ser negativo");
		} else {
			this.precoMacas = precoMacas;
		}
	}

	public int getLaranjasVendidas() {
		return laranjasVendidas;
	}

	public void setLaranjasVendidas(int laranjasVendidas) {
		if (laranjasVendidas < 0) {
			System.out.println("Erro, numero de laranjas vendidas invalido");
		} else {
			this.laranjasVendidas = laranjasVendidas;
		}
	}

	public double getPrecoLaranjas() {
		return precoLaranjas;
	}

	public void setPrecoLaranjas(double precoLaranjas) {
		if (precoLaranjas < 0) {
			System.out.println("Erro, preco da laranja nao pode ser negativo");
		} else {
			this.precoLaranjas = precoLaranjas;
		}
	}

	public double lucroMacas() {
		return macasVendidas * precoMacas;
	}

	public double lucroLaranja() {
		return laranjasVendidas * precoLaranjas;
	}

	public double lucroTotal() {
		return lucroMacas() + lucroLaranja();

	}

}
