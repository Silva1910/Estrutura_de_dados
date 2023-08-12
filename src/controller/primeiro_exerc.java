package controller;

public class primeiro_exerc {

	public primeiro_exerc() {
		super();
	}

	public int primeiro_exerc(int n) {

		if (n == 0) { // condição de parada
			return 0;

		}
		return n + primeiro_exerc(n - 1); // condição de chamada dos proximos passos
	}
}
