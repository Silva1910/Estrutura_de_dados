package AULA2.Exercicio7.view;

import AULA2.Exercicio7.Controller.Controller;

public class view {

	public static void main(String[] args) {
		Controller pc = new Controller();
			int a = 836353;
			int b = 3;
			
			int quant = 0;
 
   
			int Controller = pc.Controller(a,b,quant); 
			
			System.out.println("A quantidade de vezes que o numero se repete e: " + Controller);
  
		
	}

}
