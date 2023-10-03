package imposto;

public class Contribuinte {

	/*
	 * Para efetuar o recolhimento do Imposto de Renda a Receita Federal tem o NOME,
	 * CPF, UF (RS, PR e SC) e RENDA ANUAL. EX: Nome: João da Silva CPF:
	 * 123.456.789-00 UF: PR RendaAnual: R$40.000
	 * 
	 * Para o cálculo do imposto a pagar de cada contribuinte, considere o seguinte:
	 * 
	 * Nível de Renda Anual Alíquota 0 a 4.000 0% 4.001 a 9.000 5,8% 9.001 a 25.000
	 * 15% 25.001 a 35.000 27,5% acima de 35.000 30%
	 * 
	 * 
	 * Sendo assim, deve-se calcular o imposto a pagar do seguinte modo: Imposto a
	 * pagar = Renda Anual * Alíquota
	 * 
	 */

	private String nome;
	private String CPF;
	private String UF;
	private double rendaAnual;

	public Contribuinte(String nome, String CPF, String UF, double rendaAnual) {

		setNome(nome);
		setCPF(CPF);
		setUF(UF);
		setRendaAnual(rendaAnual);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	public double Aliquoto() {
		if (rendaAnual < 4000) {
			return 0;
		} else if (rendaAnual > 4000 && rendaAnual < 9000) {
			return rendaAnual * 0.058;
		} else if (rendaAnual > 9000 && rendaAnual < 25000) {
			return rendaAnual * 0.15;
		} else if (rendaAnual > 25000 && rendaAnual < 35000) {
			return rendaAnual * 2.75;
		} else {
			return rendaAnual * 0.30;
		}
	}

	public double imposto() {
		double armazenar = Aliquoto();
		return armazenar * rendaAnual;
	}
}
