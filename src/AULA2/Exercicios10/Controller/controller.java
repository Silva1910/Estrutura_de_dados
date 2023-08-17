package AULA2.Exercicios10.Controller;

public class controller {

	public controller() {
		super();
	}

	public int Controller(int n) {
		if (n <= 0) { // condicao de parada
            return 0;
        } else if (n == 1) {  // condicao de parada
            return 1;
        } else {
            return Controller(n - 1) + Controller(n - 2); // chamada da funcao
        }

		}
		
	}
