package aula17;

import java.util.Scanner;

public class exercicioRevisao {

	public static void main(String[] args) {

		// um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de
		// seus cliente.
		// 30 deles foram ouvidos e para cada um perguntou-se o sexo (1=feminino,
		// 2=masculno)
		// uma nota para o cinema (0 á 10)
		// baseado nisso faça um programa que informe:

		// qual a nota media recebida pelo cinema
		// qual a nota média atribuida pelos homens
		// qual a nota atribuida pela mulher mais jovem
		// quantas das mulheres com mais de 50 anos deram nota superior a media recebida
		// pelo cinema
		
		Scanner teclado = new Scanner(System.in);
		
		int feminino = 0;
		int masculino = 0;
		int mulherNova = 0;
		int mulherVelha = 0;
		
		int sexo;
		int idade;
		int nota;
		
		int menor = Integer.MAX_VALUE;
		int contadorUm = 0;
		int contadorDois = 0;
		int media = 0;
		int soma = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Informe seu genero (1=feminino, 2=masculino)");
			sexo = teclado.nextInt();
			System.out.println("Digite uma nota de 0 á 10");
			nota = teclado.nextInt();
			System.out.println("Digite sua idade");
			idade = teclado.nextInt();
			
			soma = soma + nota;
			
			if (sexo == 2) {
				masculino = masculino + nota;
				contadorUm++;
			} else {
				feminino = sexo;
				if (idade < menor) {
					menor = idade;
					mulherNova = nota;
				}
				if (idade >= 50) {
					mulherVelha = nota;
				}
				if (mulherVelha > media) {
					contadorDois++;
				}
			}
			
		}
		
		media = soma / 3;
		
		System.out.println("Média das notas: " + media);
		System.out.println("Média notas homens: " + (masculino/contadorUm));
		System.out.println("Nota mulher mais jovem: " + mulherNova);
		System.out.println(contadorDois + " mulhere(s) acima de 50 ano(s) deram notas acima da média");
	}

}
