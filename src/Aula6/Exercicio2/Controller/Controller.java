package Aula6.Exercicio2.Controller;

import model.PilhaString;

public class Controller {
	PilhaString p = new PilhaString();
    PilhaString p1 = new PilhaString();
    PilhaString p2 = new PilhaString();
   
    public Controller() {
      super();
    }

    public void invertePalavra(String texto) throws Exception {
    	
    	int size = texto.length();

        for (int i = 0; i < size; i++) {
            // Converter cada caractere em uma string e empilhá-lo
            String letraComoString = String.valueOf(texto.charAt(i));
            p.push(letraComoString);
            p2.push(letraComoString);
        }
        // Inverta a pilha p2
        while (!p.isEmpty()) {
            p1.push(p.pop());
        }
        
    }

    public boolean comparaPalavra() throws Exception {
        while (!p1.isEmpty()) {
            if (!p1.top().equals(p2.top())) {
                return false; // Encontrou uma diferença, não é um palíndromo
            }
            p1.pop();
            p2.pop();
        }
        return true; // É um palíndromo, pois todas as letras foram iguais
    }
}
