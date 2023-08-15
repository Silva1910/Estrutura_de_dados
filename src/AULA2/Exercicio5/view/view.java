package AULA2.Exercicio5.view;

import AULA2.Exercicio5.Controller.Exercicio5;

public class view {
	

		public static void main(String[] args) {
			int x = 21; 
		    int y  =15;
		    Exercicio5 pc = new Exercicio5();
			int exercicio5 = pc.exercicio5(x,y); 
			
			System.out.println("O resultado da série é: " + exercicio5);


		}

}
