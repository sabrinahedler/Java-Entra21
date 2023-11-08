package resolucao;

import java.util.ArrayList;

public class Floricultura {

	// Em um sistema de uma floricultura deve se guardar o nome da flor, o preço,
	// nome do cliente que comprou a flor e se a flor é para presente ou não.

	// Em um sistema de uma floricultura deve se guardar o nome da flor,
		// o preço, nome do cliente que comprou a flor e se a flor é para presente ou
		// não.

		public static ArrayList<Floricultura> listaFlores = new ArrayList<Floricultura>();
		private String nomeFlor;
		private double preco;
		private String cliente;
		private String presente;

		public Floricultura(String nomeFlor, double preco, String cliente, String presente) {
			setNomeFlor(nomeFlor);
			setPreco(preco);
			setCliente(cliente);
			setPresente(presente);
			listaFlores.add(this);
		}

		public String getNomeFlor() {
			return nomeFlor;
		}

		public void setNomeFlor(String nomeFlor) {
			this.nomeFlor = nomeFlor;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			if (preco <= 0) {
				throw new IllegalArgumentException("Invalido, valor não pode ser negativo");
			}
			this.preco = preco;
		}

		public String getCliente() {
			return cliente;
		}

		public void setCliente(String cliente) {
			this.cliente = cliente;
		}

		public String getPresente() {
			return presente;
		}

		public void setPresente(String presente) {
			this.presente = presente;
		}

		@Override
		public String toString() {
			return "A flor " + this.nomeFlor + " de valor " + this.preco + " foi comprada por " + this.cliente;
		}
		
	}