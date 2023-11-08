package resolucao;

import java.util.ArrayList;
import java.util.List;

public class CamaraMunicipal {

	/*
	 * A Câmara Municipal de Vereadores de Blumenau pretende realizar uma
	 * estatística sobre o desempenho dos seus parlamentares. Para cada um dos 15
	 * vereadores, ela possui o nome, partido, quantidade de projetos apresentados,
	 * quantidade de projetos aprovados. O desempenho é calculado da seguinte forma:
	 * (projetos aprovados / projetos apresentados) * índice de trabalho. Se não
	 * apresentou nenhum projeto, o desempenho é 0 (zero).
	 * 
	 * O índice de trabalho é definido pela seguinte tabela: Projetos apresentados
	 * Índice de trabalho 01 – 05 0,80 06 – 10 1,00 11 – 17 1,08 acima de 17 1,22
	 */

	private String nome;
	private String partido;
	private double projetosApresentados;
	private double projetosAprovados;
	public static List<CamaraMunicipal> listaVereadores = new ArrayList<CamaraMunicipal>();

	public CamaraMunicipal(String nome, String partido, int projetosApresentados, int projetosAprovados) {
		setNome(nome);
		setPartido(partido);
		setProjetosApresentados(projetosApresentados);
		setProjetosAprovados(projetosAprovados);
		listaVereadores.add(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null) {
			throw new IllegalArgumentException("invalido, não pode ser nulo");
		}
		this.nome = nome;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public double getProjetosApresentados() {
		return projetosApresentados;
	}

	public void setProjetosApresentados(int projetosApresentados) {
		if (projetosApresentados < 0) {
			throw new IllegalArgumentException("invalido, numero não pode ser negativo");
		}
		this.projetosApresentados = projetosApresentados;
	}

	public double getProjetosAprovados() {
		return projetosAprovados;
	}

	public void setProjetosAprovados(int projetosAprovados) {
		this.projetosAprovados = projetosAprovados;
	}

	public double indiceTrabalho() {
		if (projetosApresentados >= 1 && projetosApresentados <= 5) {
			return 0.80;
		} else if (projetosApresentados >= 6 && projetosApresentados <= 10) {
			return 1.00;
		} else if (projetosApresentados >= 11 && projetosApresentados <= 17) {
			return 1.08;
		} else if (projetosApresentados > 17) {
			return 1.22;
		} else {
			return 0;
		}
	}

	public double desempenho() {
		return (projetosAprovados / projetosApresentados) * indiceTrabalho();
	}

	@Override
	public String toString() {
		return "vereador " + this.nome + " do partido " + this.partido;
	}
}