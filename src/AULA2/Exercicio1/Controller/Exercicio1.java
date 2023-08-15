package AULA2.Exercicio1.Controller;



public class Exercicio1 {

	public Exercicio1() {
		super();
	}
	public int exercicio1(int A, int B, int soma) {
		if (B == 1) { // ponto de parada
			return A;
		} else {
			return soma =   A + exercicio1(A, B - 1, soma); // retorno da função
		}

	}

}

