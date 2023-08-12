package controller;

public class segundo_exerc {

	public segundo_exerc() {
		super();
	}

	public int segundo_exerc(int[] vetor, int tamanho) {
		int menor = vetor[0];
		if (tamanho == 0) { // condição de parada
			return vetor[tamanho];
		} else if (vetor[tamanho] < vetor[tamanho - 1]) {
			menor = vetor[tamanho];

		} else {
			return segundo_exerc(vetor, tamanho - 1); // chamada dos passos se o tamanho !=0 
		} 
		return menor;
	}
}
