package AULA2.Exercicios10.view;
import AULA2.Exercicios10.Controller.*;
public class view {

	public static void main(String[] args) {
		Controller Controller = new Controller();
		int n =6;
		
		int temp = Controller.Controller(n);
		System.out.println("o resultado da serie de fibonacci do numero==> " + n + " e ==> "+ temp );
				

	}

}
