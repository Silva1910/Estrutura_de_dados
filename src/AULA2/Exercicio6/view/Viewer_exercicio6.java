package AULA2.Exercicio6.view;

import AULA2.Exercicio6.conrtoller.Controller;


public class Viewer_exercicio6 {
		public static void main(String[] args) {
			
		    Controller pc = new Controller();
			int n = 1010;
			int quant= 0;
			int Controller = pc.Controller(n,quant); 
			
			System.out.println("A quantidade de digitos e: " + Controller);


		}
	}


