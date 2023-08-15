package AULA2.Exercicio1.view;

import AULA2.Exercicio1.Controller.exercicio1;

public class Principal {

	public static void main(String[] args) {
		int A = 2;
		int B = 8;
		int soma = 0;

		exercicio1 ex = new exercicio1();
		int exercicio1 = ex.exercicio1(A, B, soma);
		System.out.println("o resultado da multiplicação é ==> " + exercicio1);

	}

}
