package Aula6.Exercicio3.view;

import javax.swing.JOptionPane;

import model.PilhaInteiros;
import Aula6.Exercicio3.Controller.*;
public class Main {

	public static void main(String[] args) throws Exception {

		PilhaInteiros p = new PilhaInteiros();
		int valor1;
		int valor2;
		
for (int i = 0; i<4; i++ ) {
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("digite um numero para que possa ser feito o calculo"));

		valor2 = Integer.parseInt(JOptionPane.showInputDialog("digite um numero para que possa ser feito o calculo"));
		
		String Sinal = JOptionPane.showInputDialog("digite  qual a operacao deseja fazer o calculo");
		NPRController.InsereValor(p, valor1, valor2);
		NPRController.Operacao( Sinal,  p, valor1,  valor2);
	}

	
	}
}
