package Produto;

public class Produto {

	/*
	 * A partir das representações abaixo dos objetos de uma classe Produto. Escreva
	 * o código necessário para suportar tais objetos. Ou seja, o código necessário
	 * para criar a classe e instanciar os objetos de modo que fiquem com o estado
	 * apresentado.
	 * 
	 * produto1: Produto nome = “Caderno” descricao = “Caderno em espiral tamanho
	 * médio” precoUnitario = 4,50 desconto = 15
	 * 
	 * 
	 * produto2: Produto nome = “Caneta ESF” descricao = “Caneta esferográfica 5mm”
	 * precoUnitario = 1,20 desconto = 2
	 * 
	 * 
	 * produto3: Produto nome = “Esquadro” descricao = “Esquadro de acrílico 20 cm”
	 * precoUnitario = 2,35 desconto = 10
	 */

	String nome;
	String descriçao;
	double precoUnitario;
	double desconto;
	
	public Produto(String nome, String descriçao, double precoUnitario, double desconto) {
		this.nome = nome;
		this.descriçao = descriçao;
		this.precoUnitario = precoUnitario;
		this.desconto = desconto;
	}
	
	

}
