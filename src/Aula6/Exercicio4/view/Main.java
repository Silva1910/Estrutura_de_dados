package Aula6.Exercicio4.view;

import javax.swing.JOptionPane;

import Aula6.Exercicio4.controller.Controller;
import model.PilhaString;

public class Main {

	public static void main(String[] args) throws Exception {
		PilhaString historico = new PilhaString();
		
		 int escolha;

	        do {
	           escolha = Integer.parseInt(JOptionPane.showInputDialog (null,    "Escolha uma opção:\n" +
	        		   "__________________________________________ \n" +
	        		   "1 - Opção  para inserir um novo endereço \n" +
		                "__________________________________________ \n" +
		                "2 - Opção  para excluir o ultimo endereço \n" +
		                "__________________________________________ \n" +
		                "3 - Opção  para mostrar o ultimo endereço \n "  +
		                "__________________________________________ \n" +
		                "4 - sair \n" +
		                "__________________________________________ \n" ));
	           
	             
	            

	           

	            switch (escolha) {
	                case 1:
	                   String Endereco = JOptionPane.showInputDialog(null, " digite um endereço para o seu historico");
	                   Controller.adicionaEndereco(historico, Endereco);
	                  
	                    break;
	                case 2:
	                   
	                    Controller.removeEndereco(historico);
	                    break;
	                case 3:
	                	 Controller.consultaEndereco(historico);
	                    break;
	                case 4:
	                    JOptionPane.showMessageDialog(null, "Saindo do programa.");
	                    break;
	                    
	                default:
	                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
	                    break;
	            }

	        } while (escolha != 4);
	    }
	}


