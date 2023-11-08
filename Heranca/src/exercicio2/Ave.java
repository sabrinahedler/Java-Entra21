package exercicio2;

public class Ave extends Primata {

	private String corPenas;
	private String alimentacao;

	public Ave(String raca, String nomeIdentificacao, String porte, String habitat, String paisOrigem, String corPenas,
			String alimentacao) {
		super(raca, nomeIdentificacao, porte, habitat, paisOrigem);
		setCorPenas(corPenas);
		setAlimentacao(alimentacao);
	}

	public void setCorPenas(String corPenas) {
		if (corPenas == null && corPenas.isBlank()) {
			throw new IllegalArgumentException("inválido, não pode ser nulo");
		}
		this.corPenas = corPenas;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		if (alimentacao == null && alimentacao.isBlank()) {
			throw new IllegalArgumentException("inválido, não pode ser nulo");
		}
		this.alimentacao = alimentacao;
	}

	@Override
	public String toString() {
		return super.toString() + " com a cor das penas predominantemente " + this.corPenas
				+ " e alimentaçao baseada em " + this.alimentacao;
	}

}
