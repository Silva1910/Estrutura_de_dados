package Aula8.Exercicio4.controller;
import javax.swing.JOptionPane;

import lib.Fila;
public class impressoraController {

	public static void insereDocumento(Fila f, String documento) {
		f.insert(documento);
		JOptionPane.showMessageDialog(null, "o arquivo " + documento + " foi inserido na fila de impressao com sucesso");
	}
	
	public static void imprime(Fila f) throws Exception {
		int tempo = (int) (Math.random() * 1000) + 1000; ;
		String aux;
		aux = (String) f.remove();
		Thread.sleep(tempo);
		JOptionPane.showMessageDialog(null,"o arquivo " + aux + " foi impresso com sucesso");
	}
	
}
