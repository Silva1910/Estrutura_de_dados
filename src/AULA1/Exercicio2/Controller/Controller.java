package AULA1.Exercicio2.Controller;

public class Controller {

	public Controller() {
		super();
	}

	public int Controller(int[] vetor, int tamanho) {
		int menor = vetor[0];
		if (tamanho == 0) { // condição de parada
			return vetor[tamanho];
		} else if (vetor[tamanho] < vetor[tamanho - 1]) {
			menor = vetor[tamanho];

		} else {
			return Controller(vetor, tamanho - 1); // chamada dos passos se o tamanho !=0
		}
		return menor;
	}

}