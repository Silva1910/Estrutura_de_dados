package AULA2.Exercicio4.controller;

public class Exercicio4 {
	public Exercicio4() {
		super();
	}

	public int exercicio4(int n) {
		if (n == 1) { // ponto de parada
			return   1;
		} else if (n % 2 != 0) {
			return n * exercicio4(n - 1);  //  retorno da função
		}
		return exercicio4(n-1); //  retorno da função
	}
}
