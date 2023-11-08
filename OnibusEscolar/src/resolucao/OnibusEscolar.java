package resolucao;

import java.util.ArrayList;
import java.util.List;

public class OnibusEscolar {

	/*
	 * Faça uma classe chamada OnibusEscolar, com os atributos estudantes e
	 * professor
	 * 
	 * Faça uma exceção no método setAlunos que se o número de alunos for maior do
	 * que 40, faça com que o número de alunos seja 40
	 * 
	 * Caso o número de professores for 0, o número de alunos também deve ser zerado
	 * 
	 * Faça também um método chamado remover alunos, que deverá remover os alunos de
	 * acordo com o valor passado como parâmetro
	 */

	private int alunos;
	private int professor;
	public static List<OnibusEscolar> listaOnibus = new ArrayList<OnibusEscolar>();

	public OnibusEscolar(int alunos, int professor) {
		setAlunos(alunos);
		setProfessor(professor);
		listaOnibus.add(this);
	}

	public int getAlunos() {
		return alunos;
	}

	public void setAlunos(int alunos) {
		if (alunos >= 40) {
			alunos = 40;
		}
		this.alunos = alunos;
	}

	public int getProfessor() {
		return professor;
	}

	public void setProfessor(int professor) {
		if (professor == 0) {
			alunos = 0;
		}
		this.professor = professor;
	}
	
	public void removerAlunos(int parametro) {
		this.alunos = alunos - parametro;
	}
	
	@Override
	public String toString() {
		return "Onibus escolar com " + this.alunos + " alunos e " + this.professor + " professor(es)";
	}

}