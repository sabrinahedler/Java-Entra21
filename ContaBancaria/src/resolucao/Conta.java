package resolucao;

import java.util.ArrayList;
import java.util.List;

public class Conta {

	/*
	 * Faça uma classe chamada Conta, com os atributos nome e saldo.
	 * 
	 * Faça um método para sacar dinheiro Outro método para depositar dinheiro E
	 * outro método para transferir dinheiro de uma conta para outra
	 */

	private String nome;
	double saldo;
	public static List<Conta> listaContas = new ArrayList<Conta>();

	public Conta(String nome, double saldo) {
		setNome(nome);
		setSaldo(saldo);
		listaContas.add(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void SacarDinheiro(double dinheiro) {
		setSaldo(saldo - dinheiro);
	}

	public void DepositarDinheiro(double dinheiro) {
		if (dinheiro <= 0) {
			throw new IllegalArgumentException("invalido, numero não pode ser negativo");
		}
		setSaldo(saldo + dinheiro);
	}

	public void TransferirDinheiro(double dinheiro) {
		setSaldo(saldo - dinheiro);
	}

	@Override
	public String toString() {
		return "o titular da conta " + this.nome + " está com um saldo atual de " + this.getSaldo();
	}

}
