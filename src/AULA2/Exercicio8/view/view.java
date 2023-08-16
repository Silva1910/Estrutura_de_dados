package AULA2.Exercicio8.view;
import AULA2.Exercicio8.Controller.*;
public class view {

	public static void main(String[] args) {
		Controller Controller = new Controller();
        String Palavra = "teste";

        String temp = Controller.invertePalavra(Palavra);
        System.out.println("a palavra original e ==>  "+ "" + Palavra + "" + "  e ela invertida fica assim ==> " + Controller.invertePalavra(Palavra));
	}

}
