package resolucao;

import java.util.Scanner;

public class PrincipalConta {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double dinheiro = 0;

		Conta c1 = new Conta("Claudia", 345.67);
		Conta c2 = new Conta("Jose", 1023.45);

		System.out.println("Informe uma operacao, sendo 1-sacar, 2-depositar, 3-transferir");
		int valor = scan.nextInt();

		switch (valor) {
		case 1:
			System.out.println("Informe um valor para sacar");
			dinheiro = scan.nextDouble();
			c2.SacarDinheiro(dinheiro);
			break;

		case 2:
			System.out.println("Informe um valor para depositar");
			dinheiro = scan.nextDouble();
			c2.DepositarDinheiro(dinheiro);
			break;

		case 3:
			System.out.println("Informe um valor para transferir");
			dinheiro = scan.nextDouble();
			c2.TransferirDinheiro(dinheiro);
			c1.DepositarDinheiro(dinheiro);
			break;

		default:
			System.out.println("Invalido");
			break;
		}

		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
