package exercicio2;

public class Primata {

	private String raca;
	private String nomeIdentificacao;
	private String porte;
	private String habitat;
	private String paisOrigem;

	public Primata(String raca, String nomeIdentificacao, String porte, String habitat, String paisOrigem) {
		super();
		setRaca(raca);
		setNomeIdentificacao(nomeIdentificacao);
		setPorte(porte);
		setHabitat(habitat);
		setPaisOrigem(paisOrigem);
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		if (raca == null && raca.isBlank()) {
			throw new IllegalArgumentException("inválido, não pode ser nulo");
		}
		this.raca = raca;
	}

	public String getNomeIdentificacao() {
		return nomeIdentificacao;
	}

	public void setNomeIdentificacao(String nomeIdentificacao) {
		if (nomeIdentificacao == null && nomeIdentificacao.isBlank()) {
			throw new IllegalArgumentException("inválido, não pode ser nulo");
		}
		this.nomeIdentificacao = nomeIdentificacao;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		if (porte.equalsIgnoreCase("medio") || porte.equalsIgnoreCase("pequeno") || porte.equalsIgnoreCase("grande")) {
			this.porte = porte;
		} else {
			throw new IllegalArgumentException("inválido");
		}
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		if (habitat == null && habitat.isBlank()) {
			throw new IllegalArgumentException("inválido, não pode ser nulo");
		}
		this.habitat = habitat;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		if (paisOrigem == null && paisOrigem.isBlank()) {
			throw new IllegalArgumentException("inválido, não pode ser nulo");
		}
		this.paisOrigem = paisOrigem;
	}

	@Override
	public String toString() {
		return "Animal de raça " + this.raca + " que possui nome " + this.nomeIdentificacao + ", de porte " + this.porte
				+ " que vive no habitat " + this.habitat + " localizado no pais " + this.paisOrigem;
	}

}
