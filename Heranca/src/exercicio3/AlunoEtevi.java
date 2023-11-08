package exercicio3;

public class AlunoEtevi extends Aluno {

	private int ano;

	public AlunoEtevi(String nome, int idade, int ano) {
		super(nome, idade);
		setAno(ano);
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano < 0) {
			throw new IllegalArgumentException("inválido, não pode ser negativo");
		}
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return super.toString() + " e está no " + this.ano + " serie";
	}
}
