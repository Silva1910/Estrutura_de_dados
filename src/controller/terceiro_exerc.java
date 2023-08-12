package controller;

public class terceiro_exerc {

	public terceiro_exerc() {
		super();
	}

	 public int terceiro_exerc(int n) {
		if (n == 1) { // condição de parada
			return 1;
		} else {
			return n * terceiro_exerc(n - 1);  // a função e n^(n-1)
		}
	}
}

