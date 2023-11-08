package resolucao;

import java.util.Scanner;

public class PrincipalEmpregado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe 3 valores de parametros");
		double parametroUm = scan.nextInt();
		double parametroDois = scan.nextInt();
		double parametroTres = scan.nextInt();

		Empregado e1 = new Empregado(13958, "Jose", "Santos", 1500);
		Empregado e2 = new Empregado(34567, "Maria", "Silva", 4600);
		Empregado e3 = new Empregado(45698, "Fernanda", "Campos", 3900);

		double maiorSalario = Integer.MIN_VALUE;
		String empregadoMaiorSalario = null;

		e1.modificarSalario(parametroUm);
		e2.modificarSalario(parametroDois);
		e3.modificarSalario(parametroTres);

		for (Empregado f : Empregado.listaEmpregados) {
			if (f.getSalario() > maiorSalario) {
				maiorSalario = f.getSalario();
				empregadoMaiorSalario = f.toString();
			}
		}

		System.out.println(empregadoMaiorSalario);
		System.out.println(e1.getSalario());
		System.out.println(e2.getSalario());
		System.out.println(e3.getSalario());
	}

}