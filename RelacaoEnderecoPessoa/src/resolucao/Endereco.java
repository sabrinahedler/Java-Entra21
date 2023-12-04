package resolucao;

public class Endereco {

	/*
	 * Na classe Endereco faça o seguinte:
	 * 
	 * a) Crie três atributos privados: um do tipo String para o logradouro, outro
	 * do tipo String para o complemento e um do tipo int para o número;
	 */

	private String logradouro;
	private String complemento;
	private int numero;

	public Endereco(String logradouro, String complemento, int numero) {
		setLogradouro(logradouro);
		setComplemento(complemento);
		setNumero(numero);
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		if (logradouro == null)
			;
		throw new IllegalArgumentException("invalido, numero não pode ser nulo");
	}

	{
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		if (complemento == null)
			;
		throw new IllegalArgumentException("invalido, numero não pode ser nulo");
	}

	{
		this.complemento = complemento;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			throw new IllegalArgumentException("invalido, numero não pode ser negativo");
		}
		this.numero = numero;
	}

}
