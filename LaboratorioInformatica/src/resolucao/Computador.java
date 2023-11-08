package resolucao;

import java.util.ArrayList;
import java.util.List;

public class Computador {

	/*
	 * Implemente um programa para ler o cadastro de um laboratório de informática.
	 * No laboratório existem N computadores.
	 * 
	 * Cada computador possui as seguintes informações: - número de série - modelo
	 * do processador - clock do processador em GHz - um boolean informando se pode
	 * ser feito overclock no processador - armazenamento do HDD - quantidade de
	 * memória - consumo de energia - potência da fonte
	 * 
	 * O boolean referente ao overclock não deve ser passado como parâmetro do
	 * construtor, mas atribuido true no construtor caso o modelo do processador
	 * termine em 'K' ou 'KF' ou 'X' e false caso não termine.
	 * 
	 * a) Um método que faça overclock no processador. O método deve ter como
	 * parâmetro o incremento em MHz que será feito de overclock. Os processadores
	 * só aceitam overclock até 10% do clock original. A cada 100 MHz que o clock
	 * sobe, o consumo do computador aumenta em 75W. O consumo do computador nunca
	 * deve ultrapassar 95% da potência da fonte. Note que o processador somente
	 * aceitará overclock caso a variável booleana de overclock for true. Caso não
	 * seja possível fazer o overclock, por qualquer uma das limitações, informe por
	 * que não foi possível.
	 * 
	 * b) Um método que informe o armazenamento total desse laboratório
	 * 
	 * c) O laboratório está pensando em implementar mais 3 salas iguais a essa no
	 * prédio. Eles querem saber antes qual o impacto do total de computadores nos
	 * gastos de energia elétrica. Informe qual a potência mínima em Watts que o
	 * circuito elétrico deve ter para acomodar todas as salas. A potência mínima é
	 * calculada a partir do consumo total e adicionado 10% por questões de
	 * segurança. Assumindo que eles vão rodar por uma média de 12 horas por dia,
	 * informe também o gasto de energia elétrica que a empresa terá com essas 3
	 * salas. Considere o preço da energia elétrica 71 centavos por KW/h.
	 */

	private String numeroSerie;
	private String processador;
	private double clockProcessador;
	private boolean overClock;
	private double armazenamentoHDD;
	private double qntMemoria;
	private double consumoEnergia;
	private double potenciaFonte;
	public static List<Computador> listaComputadores = new ArrayList<Computador>();
	
	public Computador(String numeroSerie, String processador, double clockProcessador, double armazenamentoHDD,
			double qntMemoria, double consumoEnergia, double potenciaFonte) {
		
		setNumeroSerie(numeroSerie);
		setProcessador(processador);
		setClockProcessador(clockProcessador);
		setArmazenamentoHDD(armazenamentoHDD);
		setQntMemoria(qntMemoria);
		setConsumoEnergia(consumoEnergia);
		setPotenciaFonte(potenciaFonte);
		listaComputadores.add(this);
	}
	
	public String getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	public String getProcessador() {
		return processador;
	}
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	public double getClockProcessador() {
		return clockProcessador;
	}
	public void setClockProcessador(double clockProcessador) {
		this.clockProcessador = clockProcessador;
	}
	public boolean isOverClock() {
		return overClock;
	}
	public void setOverClock(boolean overClock) {
		this.overClock = overClock;
	}
	public double getArmazenamentoHDD() {
		return armazenamentoHDD;
	}
	public void setArmazenamentoHDD(double armazenamentoHDD) {
		this.armazenamentoHDD = armazenamentoHDD;
	}
	public double getQntMemoria() {
		return qntMemoria;
	}
	public void setQntMemoria(double qntMemoria) {
		this.qntMemoria = qntMemoria;
	}
	public double getConsumoEnergia() {
		return consumoEnergia;
	}
	public void setConsumoEnergia(double consumoEnergia) {
		this.consumoEnergia = consumoEnergia;
	}
	public double getPotenciaFonte() {
		return potenciaFonte;
	}
	public void setPotenciaFonte(double potenciaFonte) {
		this.potenciaFonte = potenciaFonte;
	}
	
}
