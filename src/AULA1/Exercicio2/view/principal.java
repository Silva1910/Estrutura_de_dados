package AULA1.Exercicio2.view;

import AULA1.Exercicio2.*;

public class principal {

	public static void main(String[] args) {
		
			int [] vetor = {10,22,30,4,5}; 
			int tamanho = vetor.length-1;
			
			Controller vc = new Controller(); 
			int Controller = vc.Controller(vetor, tamanho);
			System.out.println("o menor numero  e igual á ==>" + Controller);
		}
	}


