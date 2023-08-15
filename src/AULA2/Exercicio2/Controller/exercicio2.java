package AULA2.Exercicio2.Controller;

public class exercicio2 {

	public exercicio2() {
		super();
	
	}

	public int Exercicio2( int DIVISOR, int resto) {
		if (resto<  DIVISOR) { // ponto de parada
			return resto;}
		else { 
			resto = resto - DIVISOR; 
			 return   Exercicio2 (DIVISOR, resto); // retorno da função
		}
	
	}

}
