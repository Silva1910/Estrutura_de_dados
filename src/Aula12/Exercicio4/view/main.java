package Aula12.Exercicio4.view;

import javax.swing.JOptionPane;
import Aula12.Exercicio4.controller.*;

import Aula12.Exercicio4.model.model;
import LibLista.Lista;

public class main {
	public static <t> void main(String[] args) throws Exception {
		Lista<model>[] l = (Lista<model>[]) new Lista[4];
		for (int i = 0; i < 4; i++) {
			l[i] = new Lista();
		}

		do {
			int opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Selecione uma opção:\n" + "================================================================== \n"
							+ "1 - Inserir um novo departamento  \n"
							+ "================================================================== \n"
							+ "2 - consultar os departamentos de todos os andares \n"
							+ "================================================================== \n"
							+ "3 - excluir um departamento \n"
							+ "================================================================== \n"
							+ "4 - consultar departamento de um andar especifico \n"
							+ "================================================================== \n" + "9 - Sair \n"
							+ "================================================================== \n"));

			switch (opc) {

			case 1:
				String departamento = JOptionPane
						.showInputDialog("Digite o  andar; nome do departamento; descricao; \n"
								+ "================================================================== \n"
								+ " opcoes de andares abaixo ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓   \n"
								+ "0 terreo, 1 primero andar, 2 segundo andar, 3 terceiro andar  \n");
				
				

				controller.adicionaDepartamento(l, departamento);

				break;
			case 2:
				
					controller.consulta(l);
				
				break;
			case 3:
				int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite qual o andar do departamento que quer excluir"));
				int posicao2 = Integer
						.parseInt(JOptionPane.showInputDialog("Digite qual o indice de classificacao; obs caso duvida use o metodo consulta"));
				if (l[posicao] == null || l[posicao].isEmpty()) {
					JOptionPane.showMessageDialog(null, "o prédio está vazio", "Erro", JOptionPane.ERROR_MESSAGE);
				} else if (posicao > l.length - 1) {
					JOptionPane.showMessageDialog(null, "Índice inválido", "Erro", JOptionPane.ERROR_MESSAGE);
				} else {
					controller.removeDepartamento(l, posicao, posicao2);
				} 	break;

			case 4:
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite qual o andar do departamento"));
				posicao2 = Integer
						.parseInt(JOptionPane.showInputDialog("Digite qual o indice de classificacao; obs caso duvida use o metodo consulta" ));

				if (l[posicao] == null || l[posicao].isEmpty()) {
					JOptionPane.showMessageDialog(null, "o predio   está vazio", "Erro", JOptionPane.ERROR_MESSAGE);

				}  else {

					controller.consultaDepartamento(l, posicao, posicao2);
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
