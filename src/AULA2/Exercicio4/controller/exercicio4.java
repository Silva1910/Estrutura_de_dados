package AULA2.Exercicio4.controller;

public class exercicio4 {
	public exercicio4() {
		super();
	}

	public int exercicio4(int n) {
		if (n == 1) { 
			return 1;
		} else if (n % 2 != 0) {
			return n * exercicio4(n - 1); 
		}
		return exercicio4(n-1);
	}
}
