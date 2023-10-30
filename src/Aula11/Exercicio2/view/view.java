package Aula11.Exercicio2.view;

import Aula11.Exercicio2.controller.controller;
import Aula11.Exercicio2.model.model;
import LibLista.Lista;

import javax.swing.JOptionPane;

import LibLista.Lista;

public class view {

	public static <t> void main(String[] args) throws Exception {
		Lista<model>[] l = (Lista<model>[]) new Lista[10];
		for (int i = 0; i < 10; i++) {
			l[i] = new Lista();
		}

		do {
			int opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Selecione uma opção:\n" + "================================================================== \n"
							+ "1 - Inserir um novo morador  \n"
							+ "================================================================== \n"
							+ "2 - consultar moradores de todos os andares \n"
							+ "================================================================== \n"
							+ "3 - para excluir a permissao de garagem \n"
							+ "================================================================== \n"
							+ "4 - consultar morador de um andar especifico \n"
							+ "================================================================== \n" + "9 - Sair \n"
							+ "================================================================== \n"));

			switch (opc) {

			case 1:
				String morador = JOptionPane
						.showInputDialog("Digite o  nome do morador; numero apto; modelo; cor; placa; ");

				controller.adicionaMorador(l, morador);

				break;
			case 2:
				
					controller.consulta(l);
				
				break;
			case 3:
				int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite qual o andar do morador"));
				int posicao2 = Integer
						.parseInt(JOptionPane.showInputDialog("Digite qual a ordenacao da sua garagem conforme o seu andar"));
				if (l[posicao] == null || l[posicao].isEmpty()) {
					JOptionPane.showMessageDialog(null, "o prédio está vazio", "Erro", JOptionPane.ERROR_MESSAGE);
				} else if (posicao > l.length - 1) {
					JOptionPane.showMessageDialog(null, "Índice inválido", "Erro", JOptionPane.ERROR_MESSAGE);
				} else {
					controller.removeMorador(l, posicao, posicao2);
				} 	break;

			case 4:
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite qual o andar do morador"));
				posicao2 = Integer
						.parseInt(JOptionPane.showInputDialog("Digite qual a sua ordenação  de garagem "));

				if (l[posicao] == null || l[posicao].isEmpty()) {
					JOptionPane.showMessageDialog(null, "o predio   está vazio", "Erro", JOptionPane.ERROR_MESSAGE);

				} else if (posicao > l[posicao].size() - 1) {
					JOptionPane.showMessageDialog(null, "Indice invalido", "Erro", JOptionPane.ERROR_MESSAGE);

				} else {

					controller.consultaMorador(l, posicao, posicao2);
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
