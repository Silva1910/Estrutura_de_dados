package Aula8.Exercicio3.view;

import Aula8.Exercicio3.object.object;
import Aula8.Exercicio3.controller.escalonadorController;
import lib.Fila;

public class main {  
    public static void main(String[] args) throws Exception {
        Fila<object> f = new Fila<>();
        int i = 0;

        while (i < 4) {
            int QtdRetornos;
            String nome;

            if (i == 0) {
                QtdRetornos = 14;
                nome = "notepad.exe";
            } else if (i == 1) {
                QtdRetornos = 35;
                nome = "write.exe";
            } else if (i == 2) {
                QtdRetornos = 27;
                nome = "chrome.exe";
            } else {
                QtdRetornos = 52;
                nome = "acrobat.exe";
            }

            object processo = new object(nome, QtdRetornos);
            f.insert(processo);
            i++;
        }

        escalonadorController controller = new escalonadorController(f);
    }
}
