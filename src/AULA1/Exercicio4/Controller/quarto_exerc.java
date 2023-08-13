package AULA1.Exercicio4.Controller;

public class quarto_exerc {

	public quarto_exerc() {
		super();
	}

	public int quarto_exerc(int[] vetor, int tamanho) {
		int ttnegativos = 0;

		if (tamanho == 0) { // condição de parada
			if (vetor[tamanho] < 0) {
				ttnegativos += 1;
			}
		} else {
			if (vetor[tamanho] < 0) {
				ttnegativos += 1; 
			}
			ttnegativos += quarto_exerc(vetor, tamanho - 1); // se vetor(tamanho) < 0 então ttnegativos ++
		}

		return ttnegativos;
	}
}
