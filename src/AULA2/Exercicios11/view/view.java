package AULA2.Exercicios11.view;

import AULA2.Exercicios11.Controller.*;

public class view {

	public static void main(String args[]) {
		controller Controller = new controller();
		int n = 5;

		double temp = Controller.serie(n);
		System.out.println("o resultado da serie e " + temp);
	}
}
