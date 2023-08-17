package AULA2.Exercicio9.Controller;

public class controller {
	public controller() {
		super();
	}

	public String Calculo(int n, String binario) {
		if (n != 0) {  // ponto de parada
			int resto = n % 2; 
			n = n / 2;
			binario = String.valueOf(resto) + binario;
			return Calculo(n, binario); // retorno da funcao
		} else {
			return binario; // retorno da funcao final

		}
	}
}
