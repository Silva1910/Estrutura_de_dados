
package Aula6.Exercicio1.view;

import Aula6.Exercicio1.Controller.Controller;

public class Main {

    public static void main(String[] args) throws Exception {
        int[] vetor = { 0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5 };
        Controller controller = new Controller(); // Criando uma instância do controlador

        controller.processarVetor(vetor);
    }
}