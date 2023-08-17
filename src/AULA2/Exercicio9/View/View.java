package AULA2.Exercicio9.View;
import AULA2.Exercicio9.Controller.*;
public class View {

	public static void main(String[] args) {
	Controller Controller = new Controller();
	
	 int n =25;
	 String binario = "";
	 String temp = Controller.Calculo(n,binario); 
	
	System.out.println("o numero convertido para binarios e: " + temp);
  
	 
	}

}
