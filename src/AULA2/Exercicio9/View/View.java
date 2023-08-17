package AULA2.Exercicio9.View;
import AULA2.Exercicio9.Controller.*;
public class View {

	public static void main(String[] args) {
	controller Controller = new controller();
	
	 int n =25;
	 String binario = "";
	 String temp = Controller.Calculo(n,binario); 
	
	System.out.println("o numero convertido para binarios e: " + temp);
  
	 
	}

}
