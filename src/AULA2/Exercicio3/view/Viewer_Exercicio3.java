package AULA2.Exercicio3.view;

import AULA2.Exercicio3.Controller.Exercicio3;

public class Viewer_Exercicio3 {

	public static void main(String[] args) {
		int [] vetor = {1,2,3,4,5}; 
		int tamanho = vetor.length;
		
		Exercicio3 pc = new Exercicio3(); 
		int exercicio3 = pc.exercicio3(vetor, tamanho, 0);
		System.out.println("o total de pares e ==>" + exercicio3);

	}

}
