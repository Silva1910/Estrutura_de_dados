package Aula8.Exercicio1.controller;

import lib.Fila;
import Aula8.Exercicio1.model.Model;

public class operacaoController {

    public static void caixa(Fila<Model> filaClientes) throws Exception {
        while (!filaClientes.isEmpty()) {
            Model cliente = filaClientes.remove(); // Remova o elemento da fila imediatamente
            int quantidadePecas = cliente.getQuantidadePecas();
            double valorPecas = cliente.getValorPecas();

            int valorTotal = (int) (quantidadePecas * valorPecas);

            System.out.println("O valor total da compra ==>: " + valorTotal + " para o cliente " + cliente.getNome());
        }
    }
}
