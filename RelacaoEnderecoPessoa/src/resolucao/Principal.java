package resolucao;

public class Principal {

	public static void main(String[] args) {

		/*
		 * O objetivo deste exercício é implementar a relação entre uma pessoa e seu
		 * endereço.
		 * 
		 * Para isto crie três classes: Pessoa.java, Endereco.java e Principal.java.
		 * 
		 * Na classe Principal faça o seguinte:
		 * 
		 * a) Dentro do main crie vários objetos a partir da classe Pessoa;
		 * 
		 * b) Percorra a lista de Pessoas e chame o método toString da classe Pessoa
		 * para mostrar o nome de cada pessoa e seu endereço de contato.
		 * 
		 */

		Pessoa p1 = new Pessoa("Fernanda", "Itoupavazinha");
		Pessoa p2 = new Pessoa("Otavio", "Itoupava Seca");
		Pessoa p3 = new Pessoa("Paulo", "Itoupava Central");
		Pessoa p4 = new Pessoa("Maria", "Centro");
		Pessoa p5 = new Pessoa("Elena", "Garcia");

		Endereco e1 = new Endereco("Rua Leopoldo Ewald", "casa", 45);
		Endereco e2 = new Endereco("Rua Jose Deke", "apartamento", 123);
		Endereco e3 = new Endereco("Rua Adolfo Volles", "casa", 256);
		Endereco e4 = new Endereco("Rua 10 de setembro", "apartamento", 91);
		Endereco e5 = new Endereco("Rua Araranguá", "apartamento", 301);
		
		for (Pessoa p : Pessoa.listaPessoas) {
			System.out.println(p.toString());
		}
	}
}
