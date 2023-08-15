package AULA2.Exercicio3.Controller;

public class exercicio3 {

	public exercicio3 () {
	super();	
	}

	public int exercicio3(int[] vetor, int tamanho, int total_pares) {
		
		if (tamanho == 0) {
			return total_pares;
		} else if (vetor[tamanho-1] % 2 == 0) {
			total_pares = total_pares + 1;
			return exercicio3(vetor, tamanho - 1, total_pares);
			

		} else {
			return exercicio3(vetor, tamanho - 1, total_pares); // 
		}
		
	}
}
