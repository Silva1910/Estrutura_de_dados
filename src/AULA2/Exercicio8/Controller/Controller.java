package AULA2.Exercicio8.Controller;

public class Controller {

	public Controller() {
		super();
	}

	public String invertePalavra(String palavra) {
        // Return the array when empty.
        if(palavra.isEmpty()) {
            return palavra;
        } else {
            // Call recursion removing the first letter.
            // Concatenate the returned string with the original first letter, reversing the original order. 
            return invertePalavra(palavra.substring(1)).concat(palavra.substring(0,1));
        }
    }
	
	}
