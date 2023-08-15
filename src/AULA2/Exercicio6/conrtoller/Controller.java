package AULA2.Exercicio6.conrtoller;

public class Controller {

	public Controller() {
		super();
	}

public int Controller(int n, int quant){
	if (n!=0) {
	n = n/10;
	quant = quant +1;
	return Controller(n,quant);  }
	else {
		return quant;
		
	}
	
			}
}
