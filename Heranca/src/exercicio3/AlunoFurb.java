package exercicio3;

public class AlunoFurb extends Aluno{

	private char formalIngresso;
	private String curso;
	private String atletica;

	
	
	public AlunoFurb(String nome, int idade, char formalIngresso, String curso, String atletica) {
		super(nome, idade);
		setFormalIngresso(formalIngresso);
		setCurso(curso);
		setAtletica(atletica);
	}
	
	public char getFormalIngresso() {
		return formalIngresso;
	}

	public void setFormalIngresso(char formalIngresso) {
		this.formalIngresso = formalIngresso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		if (curso == null && curso.isBlank()) {
			throw new IllegalArgumentException("inválido, não pode ser nulo");
		}
		this.curso = curso;
	}

	public String getAtletica() {
		return atletica;
	}

	public void setAtletica(String atletica) {
		if (atletica == null && atletica.isBlank()) {
			throw new IllegalArgumentException("inválido, não pode ser nulo");
		}
		this.atletica = atletica;
	}

	public String trancarCurso () {
		return curso = null;
	
}
	@Override
	public String toString () {
		return super.toString() + " entrou na faculdade pelo " + this.formalIngresso + " e está cursando: " + this.curso;
	}

	
}
