package Aula11.Exercicio3.view;

import javax.swing.JOptionPane;


import Aula11.Exercicio3.controller.controller;
import Aula11.Exercicio3.model.model;
import LibLista.Lista;

public class main {

	public static void main(String[] args) throws Exception {
		
	Lista<model>[] l = (Lista<model>[]) new Lista[5];

		

		l = new Lista[5];
		for (int i = 0; i < 5; i++) {
			l[i] = new Lista();
		}
		do {
			int opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Selecione uma opção:\n" + "================================================================== \n"
							+ "1 - Inserir um novo chocolate   \n"
							+ "================================================================== \n"
							+ "2 - consultar barras de chocolate cadastrada \n"				
							+ "================================================================== \n" + "9 - Sair \n"
							+ "================================================================== \n"));

			switch (opc) {

			case 1:
				int largura =  Integer.parseInt(JOptionPane.showInputDialog("Digite a largura  da barra  "));
				int comprimento =  Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento da barra  "));
				int altura =  Integer.parseInt(JOptionPane.showInputDialog("Digite a altura da barra  "));
				controller.addBarra(l,altura, largura, comprimento);

				break;
			case 2:
				
					controller.consulta(l);
				
				break;
			

		

			case 9:
				JOptionPane.showMessageDialog(null, "Encerrando o programa");
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
				break;
			}

		} while (true);
	}

	}


