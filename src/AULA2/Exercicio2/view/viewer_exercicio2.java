package AULA2.Exercicio2.view;

import AULA2.Exercicio2.Controller.exercicio2;

public class viewer_exercicio2 {

	public static void main(String[] args) {

		int DIVISOR = 4;
		int resto = 51;

		exercicio2 ex = new exercicio2();
		int exercicio2 = ex.Exercicio2(DIVISOR, resto);
		System.out.println("o resultado do resto é ==> " + exercicio2);

	}
}
