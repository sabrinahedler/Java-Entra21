package exercicio3;

public class Aluno {

	private String nome;
	private int idade;
	
	public Aluno(String nome, int idade) {
		super();
		setNome(nome);
		setIdade(idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null && nome.isBlank()) {
			throw new IllegalArgumentException("inválido, não pode ser nulo");
		}
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade < 0) {
			throw new IllegalArgumentException("inválido, não pode ser negativo");
		}
		this.idade = idade;
	}
	
	@Override
	public String toString () {
		return "Aluno(a): " + this.nome + " que tem " + this.idade + " anos";
	}
	
	
}
