package resolucao;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

	/*
	 * Na classe Pessoa faça o seguinte:
	 * 
	 * a) Crie dois atributos privados: Um do tipo String para o nome da pessoa e
	 * outro do Endereco para armazenar o endereço da Pessoa;
	 * 
	 * b) Sobrescreva o método toString() da classe Object para gerar uma String com
	 * o nome da Pessoa e os três atributos de Endereco.
	 * 
	 * c) Crie uma ArrayList que terá todos os objetos de Pessoa;
	 */

	private String nomePessoa;
	private Endereco endereco;
	public static List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

	public Pessoa(String nomePessoa, String endereco) {
		setNomePessoa(nomePessoa);
		setEndereco(endereco);
		listaPessoas.add(this);
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		if (nomePessoa == null)
			;
		throw new IllegalArgumentException("invalido, numero não pode ser nulo");
	}

	{

		this.nomePessoa = nomePessoa;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		if (endereco == null)
			;
		throw new IllegalArgumentException("invalido, numero não pode ser nulo");
	}

	{
		this.endereco = endereco;
	}

	public String toString() {
		return this.nomePessoa + " mora em " + this.endereco;
	}

}
