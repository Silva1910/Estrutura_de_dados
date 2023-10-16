package Aula8.Exercicio2.view;

import javax.swing.JOptionPane;
import lib.Fila;
import Aula8.Exercicio1.controller.*;
import Aula8.Exercicio2.controller.telefoneController;

public class view {

	public static <t> void main(String[] args) throws Exception {
		Fila<t> f = new Fila<>();

		do {
			int opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Selecione uma opção:\n" + "================================================================== \n"
							+ "1 - Inserir uma nova ligacao \n"
							+ "================================================================== \n"
							+ "2 - consultar uma ligacao \n"
							+ "================================================================== \n" + "9 - Sair \n"
							+ "================================================================== \n"));

			switch (opc) {

			case 1:
				String numTelefone = JOptionPane
						.showInputDialog("Digite um  telefone para quando a pessoa estiver disponivel, visualizar");
				telefoneController.insereLigacao(f, numTelefone);
				break;
			case 2:
				if (f.isEmpty()) {
					JOptionPane.showMessageDialog(null," fila Vazia");
					break;
				} else {
					telefoneController.consultaLigacoes(f);
					break;
				}
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
