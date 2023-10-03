package pessoa;

public class Pessoa {

	/*
	 * Em uma classe denominada Pessoa, deseja-se manter o nome, sexo, data de
	 * nascimento e estado civil de uma pessoa. O sexo deve ser definido como um
	 * caracter. A data deve ser definida como String.
	 * 
	 * Crie 2 objetos de Pessoa.
	 */

	String data;
	char sexo;
	String nome;
	String civil;
	
	public Pessoa(String data, char sexo, String nome, String civil) {
		this.data = data;
		this.sexo = sexo;
		this.nome = nome;
		this.civil = civil;
	}
	
	

}
