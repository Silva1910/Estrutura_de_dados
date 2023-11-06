package Aula12.Exercicio5.view;

import javax.swing.JOptionPane;

import Aula12.Exercicio5.controller.*;
import Aula12.Exercicio5.model.model;
import LibLista.Lista;

public class main {

	public static void main(String[] args) throws Exception {
		Lista<model>[] l = (Lista<model>[]) new Lista[10];
		for (int i = 0; i < 10; i++) {
			l[i] = new Lista();
		}

		do {
			int opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Selecione uma opção:\n" + "================================================================== \n"
							+ "1 - Inserir um novo cadastro de uma conta  \n"
							+ "================================================================== \n"
							+ "2 - consultar todos os cadastros do banco  \n"
							+ "================================================================== \n"
							+ "3 - excluir uma conta \n"
							+ "================================================================== \n"
							+ "4 - consultar  uma conta espercifica \n"
							+ "================================================================== \n" + "9 - Sair \n"
							+ "================================================================== \n"));

			switch (opc) {

			case 1:
				int num = Integer.parseInt(JOptionPane.showInputDialog("Digite qual o numero da conta"));
				int cont = 0;
				int temp = num;
		        // Loop enquanto o número não for zero
		        while (temp != 0) {
		            // Remove o último dígito do número
		            temp = temp / 10;

		            // Incrementa o contador de dígitos
		            cont++;
		        }
		        if (cont>4) {
		        	JOptionPane.showMessageDialog(null, " numero da conta invalida");
		        	break;
		        }
				
				
				
				String conta = JOptionPane.showInputDialog("digite o nome do cliente");
				int saldo = Integer.parseInt(JOptionPane.showInputDialog("Digite qual o saldo da conta"));
				

				controller.adicionaConta(l,num, conta,saldo);

				break;
			case 2:
				
					controller.consulta(l);
				
				break;
			case 3:
				int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite qual o indice que  quer excluir"));
				int posicao2 = Integer
						.parseInt(JOptionPane.showInputDialog("Digite qual o indice de classificacao; obs caso duvida use o metodo consulta"));
				if (l[posicao] == null || l[posicao].isEmpty()) {
					JOptionPane.showMessageDialog(null, "o cadastro está vazio", "Erro", JOptionPane.ERROR_MESSAGE);
				} else if (posicao > l.length - 1) {
					JOptionPane.showMessageDialog(null, "Índice inválido", "Erro", JOptionPane.ERROR_MESSAGE);
				} else {
					controller.removeConta(l, posicao, posicao2);
				} 	break;

			case 4:
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite qual o indice que  quer excluir"));
				posicao2 = Integer
						.parseInt(JOptionPane.showInputDialog("Digite qual o indice de classificacao; obs caso duvida use o metodo consulta" ));

				if (l[posicao] == null || l[posicao].isEmpty()) {
					JOptionPane.showMessageDialog(null, "o cadastro  está vazio", "Erro", JOptionPane.ERROR_MESSAGE);

				}  else {

					controller.consultaConta(l, posicao, posicao2);
				}

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


