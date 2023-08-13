package AULA1.Exercicio3.view;
import AULA1.Exercicio3.Controller.*;

public class viewer_tres {

	public static void main(String[] args) {
		terceiro_exerc pc = new terceiro_exerc();
		int n = 5;
		int terceiro_exerc = pc.terceiro_exerc(n); 
		
		System.out.println("O resultado da série é: " + terceiro_exerc);
	}

}