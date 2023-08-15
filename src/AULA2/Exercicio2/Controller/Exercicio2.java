package AULA2.Exercicio2.Controller;

public class Exercicio2 {

	public Exercicio2() {
		super();
	
	}

	public int Exercicio2( int DIVISOR, int resto) {
		if (resto<  DIVISOR) {
			return resto;}
		else { 
			resto = resto - DIVISOR; 
			 return Exercicio2 (DIVISOR, resto);
		}
	
	}

}
