package pessoa;

public class Principal {

	public static void main(String[] args) {

		Pessoa um = new Pessoa("03/12/2006", 'f', "sabrina", "solteira");
		um.data = "03/12/2006";
		um.sexo = 'f';
		um.nome = "sabrina";
		um.civil = "solteira";
	
		System.out.println("Meu nome: " + um.nome);
		System.out.println("Meu genero: " + um.sexo);
		System.out.println("Minha data de nascimento: " + um.data);
		System.out.println("Meu estado civil: " + um.civil);

		//linha para separar
		System.out.println(" ");
		
		Pessoa dois = new Pessoa("21/10/1974", 'm', "marcio", "casado");

		System.out.println("Meu nome: " + dois.nome);
		System.out.println("Meu genero: " + dois.sexo);
		System.out.println("Minha data de nascimento: " + dois.data);
		System.out.println("Meu estado civil: " + dois.civil);

	}

}
