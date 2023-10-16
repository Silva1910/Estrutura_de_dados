package Aula8.Exercicio4.view;

import javax.swing.JOptionPane;

import Aula8.Exercicio2.controller.telefoneController;
import Aula8.Exercicio4.controller.impressoraController;
import lib.Fila;

public class main {

	public static <t> void main(String[] args) throws Exception {
		Fila<t> f = new Fila<>();

		do {
			int opc = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção:\n"
					+ "================================================================== \n"
					+ "1 - Inserir uma novo documento para impressao  \n"
					+ "================================================================== \n" 
					+ "2 - imprimir \n"
					+ "================================================================== \n"
					+ "3 - para saber quantos documentos tem na fila de impressao \n"
					+ "================================================================== \n" + "9 - Sair \n"
					+ "================================================================== \n"));

			switch (opc) {

			case 1:
				String documento = JOptionPane
						.showInputDialog("Digite o nome do documento que queira imprimir obs: inicio com ID_PC");
				if (documento.startsWith("ID_PC")) {
					impressoraController.insereDocumento(f, documento);
				} else {
					System.out.println("nome do arquivo e invalido");
				}
				break;
			case 2:
				if (f.isEmpty()) {
					JOptionPane.showMessageDialog(null, " fila de impressao vazia");
					break;
				} else {
					impressoraController.imprime(f);
					break;
				}
			case 3:
				if (f.isEmpty()) {
					JOptionPane.showMessageDialog(null, " fila de impressao vazia");
					break;
				} else {
					JOptionPane.showMessageDialog(null, " a quantidade de numeros na fila e ==>" + f.size());
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
