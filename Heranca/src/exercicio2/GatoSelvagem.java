package exercicio2;

public class GatoSelvagem extends Primata {

	private String corPelagem;
	private String tipoManchas;

	public GatoSelvagem(String raca, String nomeIdentificacao, String porte, String habitat, String paisOrigem,
			String corPelagem, String tipoManchas) {
		super(raca, nomeIdentificacao, porte, habitat, paisOrigem);
		setCorPelagem(corPelagem);
		setTipoManchas(tipoManchas);
	}

	public void setCorPelagem(String corPelagem) {
		if (corPelagem.equalsIgnoreCase("pardo") || corPelagem.equalsIgnoreCase("preto")) {
			this.corPelagem = corPelagem;
		} else {
			throw new IllegalArgumentException("inválido");
		}
	}

	public String getTipoManchas() {
		return tipoManchas;
	}

	public void setTipoManchas(String tipoManchas) {
		if (tipoManchas.equalsIgnoreCase("ausente") || tipoManchas.equalsIgnoreCase("nao tem")
				|| tipoManchas.equalsIgnoreCase("pintado") || tipoManchas.equalsIgnoreCase("listrado")) {
			this.tipoManchas = tipoManchas;
		} else {
			throw new IllegalArgumentException("inválido");
		}
	}

	@Override
	public String toString() {
		return super.toString() + " com manchas " + this.tipoManchas + " e cor " + this.corPelagem;
	}

}
