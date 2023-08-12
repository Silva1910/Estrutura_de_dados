package controller;

public class quinto_exerc {

	public quinto_exerc() {
		super();
	}

	public double quinto_exerc(int n) {
		
	        if (n == 1) { // condição de parada
	            return 1.0;
	        } else {
	            return 1.0 / n + quinto_exerc(n - 1);  // chamada de passos se n==1 então retorna 1 + 1/5+ 1/4+ 1/3+ 1/2
	        }
	    }
	}


