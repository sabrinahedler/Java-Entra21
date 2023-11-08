package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Primata> listaAnimais = new ArrayList<>();

		// catalogando
		Primata g1 = new GatoSelvagem("Savannah", "Flavio", "medio", "savana", "africa", "pardo", "pintado");
		Primata g2 = new GatoSelvagem("Toyger", "Golias", "pequeno", "acre", "eua", "pardo", "listrado");
		Primata a1 = new Ave("Sebosa", "colossinha", "medio", "forno", "china", "brancas", "vegetais");
		Primata a2 = new Ave("Serema", "malaysian", "pequeno", "churrasco", "malásia", "marrom", "frango assado");
		Primata p1 = new Primata("bonobos", "panicus", "medio", "floresta", "congo");
		Primata p2 = new Primata("humana", "sara", "pequeno", "cantina", "gaspar");

		for (Primata i : listaAnimais) {
			System.out.println(i.toString());
		}
	}
}