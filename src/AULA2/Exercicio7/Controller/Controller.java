package AULA2.Exercicio7.Controller;

public class Controller {
	public Controller() {
		super();
	}

	public int Controller(int a, int b, int quant) {
		if (a != 0) {
			int resto = a % 10;
			if (resto == b) {
				quant = quant + 1;
			} 
				return Controller(a / 10, b,  quant);

			}
		return quant;	
	}
		

	}
