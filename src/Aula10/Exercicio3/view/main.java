package Aula10.Exercicio3.view;

import javax.swing.JOptionPane;

import Aula10.Exercicio3.controller.playerController;
import LibSet.ListaSet;

public class main {

	public static <t> void main(String[] args) throws Exception {
		ListaSet<t> l = new ListaSet();
		do {
			int opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Selecione uma opção:\n" + "================================================================== \n"
							+ "1 - Inserir uma nova musica na playlist  \n"
							+ "================================================================== \n"
							+ "2 - para remover uma musica \n"
							+ "================================================================== \n"
							+ "3 - para executar uma musica \n"
							+ "================================================================== \n"
							+ "4 - para saber quantas musicas tem na playlist \n"
							+ "================================================================== \n" + "9 - Sair \n"
							+ "================================================================== \n"));

			switch (opc) {

			case 1:
				String music = JOptionPane.showInputDialog("Digite o nome da musica que queira add: separado por ; obs: duracao em minutos");

				playerController.adicionaMusica(l, music);

				break;
			case 2:

				int posicao = Integer.parseInt(
						JOptionPane.showInputDialog("Digite qual o indice que a sua musica esta para ser excluida"));
				if (l.isEmpty()) {
					JOptionPane.showMessageDialog(null, "A fila está vazia", "Erro", JOptionPane.ERROR_MESSAGE);

				} else if (posicao > l.size()-1) {
					JOptionPane.showMessageDialog(null, "Indice invalido", "Erro", JOptionPane.ERROR_MESSAGE);

				} else {

					playerController.removeMusica(l, posicao);
				}
				break;

			case 3:
				if (l.isEmpty()) {
					JOptionPane.showMessageDialog(null, "A fila está vazia", "Erro", JOptionPane.ERROR_MESSAGE);

				} else {
					playerController.executaPlaylist(l);
				}
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "a quantidade de musicas na playlist e ==>  " + l.size());
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
