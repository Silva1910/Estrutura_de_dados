package Aula10.Exercicio5.view;


import Aula10.Exercicio5.controller.controller.ModificacaoCadastroController;

public class Principal {
    public static void main(String[] args) {
        ModificacaoCadastroController.novoCadastro(41, 60, 8000.00);
        ModificacaoCadastroController.novoCadastro(31, 40, 5000.00);
        ModificacaoCadastroController.novoCadastro(21, 30, 3000.00);
    }
}
