package AULA2.Exercicios10.Controller;

public class Controller {

	public Controller() {
		super();
	}

	public int Controller(int n) {
		if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return Controller(n - 1) + Controller(n - 2);
        }

		}
		
	}
