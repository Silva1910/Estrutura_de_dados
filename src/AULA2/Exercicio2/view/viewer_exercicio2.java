package AULA2.Exercicio2.view;

import AULA2.Exercicio2.Controller.Exercicio2;

public class viewer_exercicio2 {

	public static void main(String[] args) {

		int DIVISOR = 4;
		int resto = 51;

		Exercicio2 ex = new Exercicio2();
		int exercicio2 = ex.Exercicio2(DIVISOR, resto);
		System.out.println("o resultado do resto é ==> " + exercicio2);

	}
}
