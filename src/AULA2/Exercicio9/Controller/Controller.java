package AULA2.Exercicio9.Controller;

public class Controller {
	public Controller() {
		super();
	}

	public String Calculo( int n, String binario ) {
		if (n!=0 ) {
		 int resto = n%2;
		  n = n /2;
		  binario = String.valueOf(resto) + binario;
		  return Calculo (n,binario);
		}else {
			return binario;
			
		}
	}
}
