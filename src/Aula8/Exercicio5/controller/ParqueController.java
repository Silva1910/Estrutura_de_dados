package Aula8.Exercicio5.controller;

import Aula8.Exercicio5.model.model;
import lib.Fila;

public class ParqueController {

    public static void processarFila(Fila<model> filaParque) throws Exception {
        while (!filaParque.isEmpty()) {
            model cliente = filaParque.remove(); // Remova o elemento da fila imediatamente
            int idade = cliente.getIdade();
            float altura = (float) cliente.getAltura();

            if (idade > 16 && altura >= 1.60) {
                System.out.println(String.format("A %s passou e pode entrar no parque. A altura e %.2f e a idade e %d.",
                        cliente.getNome(), cliente.getAltura(), cliente.getIdade()));
            } else if (idade <= 16 && altura >= 1.60) {
                System.out.println(String.format("A %s nao passou por causa da idade que e igual a %d.",
                        cliente.getNome(), cliente.getIdade()));
            } else if (idade > 16 && altura < 1.60) {
                System.out.println(String.format("A %s nao passou por causa da altura que e igual a %.2f.",
                        cliente.getNome(), cliente.getAltura()));
            } else { // idade < 16 && altura < 1.60
                System.out.println(String.format("A %s nao passou por causa da altura %.2f e por causa da idade que e %d.",
                        cliente.getNome(), cliente.getAltura(), cliente.getIdade()));
            }
        }
    }
}
