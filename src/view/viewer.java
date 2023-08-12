package view;

import controller.primeiro_exerc;

public class viewer {

	public static void main(String[] args) {

		primeiro_exerc pc = new primeiro_exerc();

		int n = 5;
		int primeiro_exerc = pc.primeiro_exerc(n);
		System.out.println("soma dos numeros naturais é igual a ==>" + primeiro_exerc);

	}

}
