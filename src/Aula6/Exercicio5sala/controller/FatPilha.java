package Aula6.Exercicio5sala.controller;

import model.PilhaInteiros;

public class FatPilha {
	public FatPilha() {
		super();
	}

	public long FatPilha(int valor) throws Exception {
		PilhaInteiros p = new PilhaInteiros();
		while (valor > 1) {
			p.push(valor);
			valor = valor - 1;
		}
		long fat = valor;
		while (!p.isEmpty()) {
			fat = fat * p.pop();
		}
		return fat;
	}
}