package Aula6.Exercicio5sala.view;

import javax.swing.JOptionPane;
import   Aula6.Exercicio5sala.controller.FatPilha;

public class main {

    public static void main(String[] args) {
        int num = 0;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        } while (num > 10 || num < 0);

        FatPilha fc = new FatPilha();

        try {
            System.out.println("O fatorial de " + num + " ==> " + fc.FatPilha(num));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
