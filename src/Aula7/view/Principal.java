package Aula7.view;
import Aula7.controller.*;
import javax.swing.JOptionPane;
import lib.Fila;

public class Principal {

    public static void main(String[] args) throws Exception {
        Fila<String> comum = new Fila<>();
        Fila<String> prioritarios = new Fila<>();
   
        

        do {
            int opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "Selecione uma opção:\n" +
                "================================================================== \n" +
                    "1 - Inserir uma nova pessoa na fila comum\n" +
                "================================================================== \n" +
                    "2 - Inserir uma nova pessoa na fila de prioritários\n" +
                "================================================================== \n" +
                    "3 - Atender a próxima pessoa\n" +
                    "================================================================== \n" +
                    "9 - Sair \n" +
                    "================================================================== \n"
            ));

            switch (opc) {
            
                case 1:
                    String nomeComum = JOptionPane.showInputDialog("Digite o nome da pessoa  que entrara na fila comum");
                    Pessoa.adicionaPilhaComum( nomeComum, comum);
                    break;
                case 2:
                    String nomePrioritario = JOptionPane.showInputDialog("Digite o nome da pessoa que entrara na prioritária");
                    Pessoa.adicionaPilhaPrioritarios( nomePrioritario, prioritarios);
                    break;
                case 3:
                    Pessoa.atenderPessoas(comum, prioritarios);
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

