package resolucao;

import java.util.ArrayList;
import java.util.List;

public class Empregado {

	/*
	 * Crie uma classe Empregado que terá como atributos: Nome, Sobrenome e Salário
	 * 
	 * Crie métodos para: Saber o salário anual do empregado Saber o nome completo
	 * Modificar o salário, o parâmetro do método deve ser o percentual de aumento
	 * Imprima o toString do usuário que após o aumento ficou com o maior do salário
	 * 
	 */

	private int identificacao;
	private String nome;
	private String sobreNome;
	private double salario;
	public static List<Empregado> listaEmpregados = new ArrayList<Empregado>();

	public Empregado(int identificacao, String nome, String sobreNome, double salario) {
		setIdentificacao(identificacao);
		setNome(nome);
		setSobreNome(sobreNome);
		setSalario(salario);
		listaEmpregados.add(this);
	}

	public int getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario <= 0) {
			System.out.println("Invalido, valor não pode ser negativo");
		}
		this.salario = salario;
	}

	public double salarioAnual() {
		return salario * 12;
	}

	public String nomeCompleto() {
		return nome + " " + sobreNome;
	}

	public void modificarSalario(double parametro) {
		double soma = this.getSalario() * parametro / 100;
		this.salario = this.getSalario() + soma;
	}

	@Override
	public String toString() {
		return "O salario do empregado " + this.nome + " é de " + this.salario;
	}
}