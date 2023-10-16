package Aula8.Exercicio1.view;

import Aula8.Exercicio1.model.Model;
import lib.Fila;
import Aula8.Exercicio1.controller.operacaoController;

public class Principal {
    public static void main(String[] args) throws Exception {
        Fila<Model> filaClientes = new Fila<>(); // Utilize generics para especificar o tipo de elementos na fila

        for (int i = 1; i <= 20; i++) {
            String nome = "Cliente" + i;
            int quantidadePecas = (int) (Math.random() * 31 + 20);
            double valorPecas = Math.random() * 95 + 5;
            Model cliente = new Model(nome, quantidadePecas, valorPecas);

            filaClientes.insert(cliente);
        }

        operacaoController.caixa(filaClientes);
    }
}
