package Aula6.Exercicio4.controller;

import javax.swing.JOptionPane;

import model.PilhaString;

public class Controller {

	public Controller() {
		super();
	}

	public static void removeEndereco(PilhaString historico ) throws Exception {
		if (!historico.isEmpty() ) {
			historico.pop();
			 JOptionPane.showMessageDialog(null, " o seu endereço  ultimo  endereço foi excluido com sucesso ");
		}
		else {
			JOptionPane.showMessageDialog(null, "não a historico armazenado para ser excluido");
		}
		
	}
		
		public static void consultaEndereco(PilhaString historico ) throws Exception {
			if (!historico.isEmpty() ) {
				JOptionPane.showMessageDialog(null," o seu ultimo historico e ===>   " +  historico.top());
			}
			else {
				JOptionPane.showMessageDialog(null, "não a historico armazenado para ser excluido");
			}
			
			
	}
		
		public static void adicionaEndereco(PilhaString historico, String endereco ) throws Exception {
			  if (endereco.startsWith("http://") || endereco.startsWith("https://") && endereco.contains("www.") && endereco.endsWith(".com")|| endereco.endsWith("co.uk")) {
		            historico.push(endereco);
		            JOptionPane.showMessageDialog(null, " o seu endereço foi adicionado com sucesso ");
		        } else {
		        	 JOptionPane.showMessageDialog(null,"O endereço não é válido.");
		        }
			
			
	}	
		
		
}
