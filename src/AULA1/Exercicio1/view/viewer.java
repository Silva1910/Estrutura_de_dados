package AULA1.Exercicio1.view;

import AULA1.Exercicio1.controller.*;
public class viewer {

	public static void main(String[] args) {
		controller pc = new controller();

		int n = 5;
		int primeiro_exerc = pc.primeiro_exerc(n);
		System.out.println("soma dos numeros naturais é igual a ==>" + primeiro_exerc);

	}

}
