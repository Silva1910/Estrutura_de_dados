package Aula5.view;

import javax.swing.JOptionPane;

import Aula5.Controller.ConverteController;
import model.PilhaInteiros;

public class Principal {

	public static void main(String[] args) throws Exception {
		PilhaInteiros p = new PilhaInteiros();
		int decimal = 0;
		do {
			decimal = Integer.parseInt(JOptionPane.showInputDialog("digite um numero de 0 a 1000"));
			
		} while (decimal > 1000);

		String temp = ConverteController.dectoBin(decimal);
		System.out.println("o numero binario e " + temp);

	}
}