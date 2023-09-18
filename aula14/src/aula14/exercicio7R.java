package aula14;

public class exercicio7R {

	public static void main(String[] args) {

		// crie uma matriz
		// 2104 3 399900
		// 1600 3 329900
		// 2400 3 369000
		// 1416 2 232000
		// 3000 4 539900
		// 1985 4 299900
		// 1534 3 314900
		// 1427 3 199000
		// 1380 3 212000
		// 1494 3 242500
		// 1940 4 240000
		// 2000 3 347000
		// 1890 3 330000
		// 4478 5 699900
		// 1268 3 259900
		// primeira coluna é o tamanho da casa
		// segunda é a quantidade de quartos
		// terceira é o preço
		// a. qual a média dos preços das casas?
		// b. quanto custa a menor casa? E quantos quartos tem a casa mais cara?
		// c. qual a diferença de tamanho da casa com o maior número de quartos para a
		// casa com o menor número de quartos?

		int soma = 0;
		int media = 0;

		int[][] matriz = { { 2104, 3, 399900 }, { 1600, 3, 329900 }, { 2400, 3, 369000 }, { 1416, 2, 232000 },
				{ 3000, 4, 539900 }, { 1985, 4, 299900 }, { 1534, 3, 314900 }, { 1427, 3, 199000 }, { 1380, 3, 212000 },
				{ 1494, 3, 242500 }, { 1940, 4, 240000 }, { 2000, 3, 347000 }, { 1890, 3, 330000 }, { 4478, 5, 699900 },
				{ 1268, 3, 259900 } };

		// resposta A
		for (int linha = 0; linha < 15; linha++) {
			soma = soma + matriz[linha][2];
		}

		media = soma / matriz.length;

		System.out.println("A média de preços é: " + media);
		
		// resposta B
	
		
	}

}
