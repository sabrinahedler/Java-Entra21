package resolucao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalOnibusEscolar {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um valor para o parâmetro");
		int parametro = scan.nextInt();

		OnibusEscolar o1 = new OnibusEscolar(100, 2);
		o1.removerAlunos(parametro);

		System.out.println(o1.toString());
	}

}