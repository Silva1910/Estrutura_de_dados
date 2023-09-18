package Aula6.Exercicio2.view;

import javax.swing.JOptionPane;

import Aula6.Exercicio2.Controller.Controller;

public class Main {

	public static void main(String[] args) throws Exception {
		// Solicitar ao usuário que digite uma palavra
		String texto = JOptionPane.showInputDialog("Digite uma palavra: ");
		Controller controller = new Controller();
		controller.invertePalavra(texto); // Chamar o método de instância invertePalavra
        boolean resultado = controller.comparaPalavra(); // Chamar o método de instância comparaPalavra
      
        if (resultado == true) {
        	System.out.println("a palavra " + texto + " e um palindromo");
        } else {
        	System.out.println("a palavra " + texto + " nao e um palindromo");
        }
		
	}
	 
}