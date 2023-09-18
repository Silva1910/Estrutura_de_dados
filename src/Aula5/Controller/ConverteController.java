package Aula5.Controller;

import model.PilhaInteiros;

public class ConverteController {

	public ConverteController() {
		super();

	}

	public static String dectoBin(int decimal) {
		PilhaInteiros p = new PilhaInteiros();
		String binario = "";
		while (decimal != 0) {
			int resto = decimal % 2;
			p.push(resto);
			decimal = decimal / 2;

		}
		while (!p.isEmpty()) {
			try {
				binario += Integer.toString(p.pop());

			} catch (Exception e) {
				System.err.println(e);

			}

		}
		return binario;

	}
}
