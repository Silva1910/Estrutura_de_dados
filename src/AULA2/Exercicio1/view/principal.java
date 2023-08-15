package AULA2.Exercicio1.view;

import AULA2.Exercicio1.Controller.Exercicio1;

public class principal {

	public static void main(String[] args) {
		int A = 2;
		int B = 8;
		int soma = 0;

		Exercicio1 ex = new Exercicio1();
		int exercicio1 = ex.exercicio1(A, B, soma);
		System.out.println("o resultado da multiplicação é ==> " + exercicio1);

	}

}
