package AULA2.Exercicio1.Controller;



public class exercicio1 {

	public exercicio1() {
		super();
	}
	public int exercicio1(int A, int B, int soma) {
		if (B == 1) {
			return A;
		} else {
			return soma = A + exercicio1(A, B - 1, soma);
		}

	}

}

