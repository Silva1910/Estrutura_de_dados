package AULA1.Exercicio4.view;

import AULA1.Exercicio4.Controller.*;


	public class viewer_quarto {

		public static void main(String[] args) {

			int[] vetor = { -1, 2, -3, 4, 5 };
			int tamanho = vetor.length - 1;

			quarto_exerc pc = new quarto_exerc();

			int quarto_exerc = pc.quarto_exerc(vetor, tamanho);

			System.out.println("O resultado de numero negativos e: " + quarto_exerc);
		}

	}
