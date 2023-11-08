package resolucao;

import java.util.ArrayList;
import java.util.List;

public class VelocidadeCarro {

	/*
	 * Deseja-se criar uma classe para controlar a velocidade do carro.
	 * 
	 * Implemente os métodos: acelerar(double): void, que deve modificar o conteúdo
	 * do atributo velocidade para velocidade + parâmetro recebido (usar
	 * setVelocidade), mas desde que o valor do parâmetro seja maior ou igual a zero
	 * e menor que 20. Senão, imprime a mensagem “Não foi possível acelerar” e
	 * mantém o valor atual do atributo velocidade.
	 * 
	 * reduzir(double): void, quem modifica o conteúdo do atributo velocidade para
	 * velocidade - parâmetro recebido (usar setVelocidade), mas desde que o valor
	 * do parâmetro seja maior ou igual a zero e menor que 30. Senão, imprime a
	 * mensagem “Não foi possível reduzir” e mantém o valor atual do atributo
	 * velocidade.
	 */

	private String nomeCarro;
	private double velocidade;
	public static List<VelocidadeCarro> listaCarros = new ArrayList<VelocidadeCarro>();

	public VelocidadeCarro(String nomeCarro, double velocidade) {
		setNomeCarro(nomeCarro);
		setVelocidade(velocidade);
		listaCarros.add(this);
	}

	public String getNomeCarro() {
		return nomeCarro;
	}

	public void setNomeCarro(String nomeCarro) {
		if (nomeCarro == null || nomeCarro.isEmpty() || nomeCarro.isBlank())
			;
		throw new IllegalArgumentException("invalido, numero não pode ser nulo");
	}

	{
		this.nomeCarro = nomeCarro;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		if (velocidade < 0) {
			throw new IllegalArgumentException("invalido, numero não pode ser negativo");
		}
		this.velocidade = velocidade;
	}

	public void AcelerarVelocidade(double parametro) {
		if (parametro >= 0 && parametro < 20) {
			setVelocidade(velocidade + parametro);
		} else {
			System.out.println("Não foi possível acelerar");
		}
	}

	public void ReduzirVelocidade(double parametro) {
		if (parametro >= 0 && parametro < 30) {
			setVelocidade(velocidade - parametro);
		} else {
			System.out.println("Não foi possível reduzir");
		}
	}

	@Override
	public String toString() {
		return "o carro de modelo " + this.nomeCarro + " que está na velocidade " + this.velocidade;
	}

}
